package com.example.rodolfo.cursoandroid;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int placarA = 0;
    public int placarB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         *
         * Exibir Ícone Action Bar
         *
         */

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_launcher);


    }

    /**
     *
     * Método Adicionar Gol Time A
     *
     */

    public void addGolTimeA(View v) {
        placarA = placarA + 1;
        exibirMensagemA(placarA);
        exibirGolTimeA(placarA);
    }

    /**
     *
     * Método Exibir Gol Time A
     *
     */

    public void exibirGolTimeA(int placar) {
        TextView placarView = (TextView) findViewById(R.id.placarA);
        placarView.setText(String.valueOf(placar));
    }

    /**
     *
     * Método Exibir Mensagem Gol Time A
     *
     */

    public void exibirMensagemA(int placarA){

        switch (placarA) {
            case 1:
                Toast.makeText(getApplicationContext(), "Começou Agora!!!", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(getApplicationContext(), "Dois é Bom, mas quero Goleada!", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(getApplicationContext(), "É Goleada!!!", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(getApplicationContext(), "Perdi a conta já", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    /**
     *
     * Método Adicionar Gol Time B
     *
     */

    public void addGolTimeB(View v) {
        placarB = placarB + 1;
        exibirMensagemB(placarB);
        exibirGolTimeB(placarB);
    }

    /**
     *
     * Método Exibir Gol Time B
     *
     */

    public void exibirGolTimeB(int placar) {
        TextView placarView = (TextView) findViewById(R.id.placarB);
        placarView.setText(String.valueOf(placar));
    }

    /**
     *
     * Método Exibir Mensagem Gol Time B
     *
     */

    public void exibirMensagemB(int placarB){

        switch (placarB) {
            case 1:
                Toast.makeText(getApplicationContext(), "Ah Não Velho!!!", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(getApplicationContext(), "Segura o Placar", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(getApplicationContext(), "Não Deixa, fazer gol", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(getApplicationContext(), "Quebra as pernas deles", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    /**
     *
     * Método Limpar Placar
     *
     */

    public void limparPlacar(View v) {
        placarA = 0;
        placarB = 0;
        exibirGolTimeA(placarA);
        exibirGolTimeB(placarB);
    }

}
