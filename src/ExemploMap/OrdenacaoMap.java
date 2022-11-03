package ExemploMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class OrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("Ordem aleatoria");
        Map<String, Livro> meusLivros = new HashMap<>() {
            {
                {
                    put("autor1", new Livro("alivro1", 2.5));
                    put("bautor2", new Livro("blivro1", 402));
                    put("cautor3", new Livro("clivro1", 120));
                }
            }
        };
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + "-" + livro.getValue().getNome());

        System.out.println("Ordem inseração");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {
            {
                {
                    put("autor1", new Livro("alivro1", 2.5));
                    put("bautor2", new Livro("blivro1", 402));
                    put("cautor3", new Livro("clivro1", 120));
                }
            }
        };
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + "-" + livro.getValue().getNome());


        System.out.println("Ordem alfabetica nomes dos livors");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + "-" + livro.getValue().getNome());



        System.out.println("Ordem alfabetica nomes dos livros");
        Set<Map.Entry<String, Livro>> meusliros3 = new TreeSet<>(new ComparatorNome());
        meusliros3.addAll(meusLivros.entrySet());
        System.out.println(meusliros3);


        System.out.println("Ordem numero de paginas ");
    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, double paginas) {
        this.nome = nome;
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paginas == null) {
            if (other.paginas != null)
                return false;
        } else if (!paginas.equals(other.paginas))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
    }

}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }

}