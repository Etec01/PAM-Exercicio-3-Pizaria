package br.com.etechoracio.pizzaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText lblChopp;
    EditText lblPizzas;
    EditText lblRecheios;
    EditText lblPessoas;
    TextView lblConsumo;
    TextView lblServicos;
    TextView lblTotal;
    TextView lblPorPessoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblChopp = findViewById(R.id.lblChopp);
        lblPizzas = findViewById(R.id.lblPizzas);
        lblRecheios = findViewById(R.id.lblRecheios);
        lblPessoas = findViewById(R.id.lblPessoas);
        lblConsumo = findViewById(R.id.lblConsumo);
        lblServicos = findViewById(R.id.lblServicos);
        lblTotal = findViewById(R.id.lblTotal);
        lblPorPessoa = findViewById(R.id.lblPorPessoa);

    }

    public void Calcular(View view){
        if (lblChopp.getText().toString().isEmpty()
        || lblPizzas.getText().toString().isEmpty()
        || lblRecheios.getText().toString().isEmpty()
        || lblPessoas.getText().toString().isEmpty())
        {
            Toast.makeText(this,"Digite todos os Valores Por Favor",Toast.LENGTH_LONG).show();

        }else {

            double chopp = Double.parseDouble(lblChopp.getText().toString());
            double pizzas = Double.parseDouble(lblPizzas.getText().toString());
            double recheios = Double.parseDouble(lblRecheios.getText().toString());
            double pessoas = Double.parseDouble(lblPessoas.getText().toString());
            double consumo = (7.30 * chopp) + (31.50 * pizzas) + (5.90 * recheios);
            double servicos = consumo * 0.1;
            double total = consumo + servicos;
            double porpessoa = total / pessoas;

            lblConsumo.setText(String.valueOf(consumo));
            lblServicos.setText(String.valueOf(servicos));
            lblTotal.setText(String.valueOf(total));
            lblPorPessoa.setText(String.valueOf(porpessoa));
        }

    }
}
