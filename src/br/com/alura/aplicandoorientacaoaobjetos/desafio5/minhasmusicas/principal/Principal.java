package br.com.alura.aplicandoorientacaoaobjetos.desafio5.minhasmusicas.principal;

import br.com.alura.aplicandoorientacaoaobjetos.desafio5.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.aplicandoorientacaoaobjetos.desafio5.minhasmusicas.modelos.Musica;
import br.com.alura.aplicandoorientacaoaobjetos.desafio5.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Verstappen");
        meuPodcast.setHost("Max Verstappen");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}
