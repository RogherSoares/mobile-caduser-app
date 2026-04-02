package com.roghersoares.cadastrodeusuario;

//bloco de importações
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;


//Activity responsavel pelo formulario de entrada de novos usários
public class CreateUser  extends AppCompatActivity {

    //Declaração dos componentes de entrada de texto (materialdesign) edo botão
    TextInputEditText editNome, editEmail;
    Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_user);


        //vincula variavel com elemento de interface gráfica, escrito no arquivo xml
        //vinvula os IDs definidos no XML aos objetos JAVA (mapeamento)
        editNome = findViewById(R.id.nome_completo);
        editEmail = findViewById(R.id.email);
        btnSalvar = findViewById(R.id.btnSalvar);

        //configura o escutador de cliques (listner) para o botão salvar
        btnSalvar.setOnClickListener(v -> {
            String nome = editNome.getText().toString();
            String email = editEmail.getText().toString();

            //Validação simples: só permite se o campo nome não estiver vazio
            if(!nome.isEmpty()){

                //Operação de dados: Acessa alista estatica da MAinActivity
                MainActivity.listaNomes.add(nome +"(" + email +")");
                finish();
            }
        });
    }
}
