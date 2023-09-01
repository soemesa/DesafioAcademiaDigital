package academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {
    private String nome;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getBairro() {
        return bairro;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    private String cpf;
    private String bairro;
    private LocalDate dataDeNascimento;
}
