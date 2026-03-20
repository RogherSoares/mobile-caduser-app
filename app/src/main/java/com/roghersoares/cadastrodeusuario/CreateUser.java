package com.roghersoares.cadastrodeusuario;

//bloco de importações
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;


//classe principal
public class CreateUser  extends AppCompatActivity {
    textInputEditText editNome, editEmail;
    Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_user);

        //vincula variavel com elemento de interface gráfica, escrito no arquivo xml
        editNome = findViewById(R.id.nome_completo);
        editEmail = findViewById(R.id.email);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(v -> {
            String nome = editNome.getText().toString();
            String email = editEmail.getText().toString();

            if(!nome.isEmpty()){
                MainActivity.listaNomes.add(nome +"(" + email +")");
                finish();
            }
        });
    }
}
