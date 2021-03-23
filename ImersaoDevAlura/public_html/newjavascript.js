function calcTot(){
    var qtd = parseFloat(document.getElementById('iVal').value);
    var moeda = parseInt(document.getElementById('iMoeda').value);
        if(moeda === 1){
            tot = qtd/5.5;
        }else{
            tot = qtd*5.5;
        }
    document.getElementById('iTot').value = tot;
    }