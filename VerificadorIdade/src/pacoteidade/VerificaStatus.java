package pacoteidade;
public class VerificaStatus {

    public String statusVoto(int idd){
        String status;
        if(idd<16){
            status = "PROIBIDO!";
        }else{
        status = ((idd>=16 && idd<18)||(idd >= 70))?"Opcinal":"OBRIGATÓRIO";
        }
        return status;
    }
}
