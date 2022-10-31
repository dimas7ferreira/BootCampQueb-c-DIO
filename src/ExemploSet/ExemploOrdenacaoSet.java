package ExemploSet;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("Ordem inserção");
        Set<Serie> minhasSeries = new HashSet<>() {
            {
                add(new Serie("got", "fantasia", 60));
                add(new Serie("dark", "drama", 60));
                add(new Serie("that 70s show", "comedia", 25));
            }
        };

        for (Serie serie : minhasSeries)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("Ordem inseração");
        Set<Serie> minhasSeries2 = new HashSet<>() {
            {
                add(new Serie("got", "fantasia", 60));
                add(new Serie("dark", "drama", 60));
                add(new Serie("that 70s show", "comedia", 25));
            }
        };

        System.out.println("Ordem natural");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries2);
        for (Serie serie : minhasSeries3)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("Ordem Nome/Genero/TempoEpisodio");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
        minhasSeries4.addAll(minhasSeries4);
        for (Serie serie : minhasSeries4)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        
            System.out.println("Ordem genero");

        System.out.println("Ordem tempo Episódio");
    }
}

class Serie implements Comparable<Serie> {
    private String nome, genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return " [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Serie serie = (Serie) obj;
        return super.equals(obj);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;
        return Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
    }
}

class ComparatoNomeGeneroTempoEpisodio implements Comparator<Serie>{
    @Override
    public int compare(Serie s1, Serie s2){
        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero;
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}