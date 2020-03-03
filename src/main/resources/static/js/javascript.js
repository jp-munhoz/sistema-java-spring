function verificaOpcao(valor) {

    if (valor == 1){
        document.getElementById("nome_dependente").disabled = false;
        document.getElementById("cpf_dependente").disabled = false;
        document.getElementById("dependente").disabled = false;

    }

    else if (valor == 2) {
        document.getElementById("nome_dependente").disabled = true;
        document.getElementById("cpf_dependente").disabled = true;
        document.getElementById("parentesco").disabled = true;
    }

}
