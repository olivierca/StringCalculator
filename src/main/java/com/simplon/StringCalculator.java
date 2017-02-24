package com.simplon;

// Différents séparateurs : la méthode peut accepter un séparateur different de la virgule,
// le début de la chaîne contiendra une ligne distincte qui ressemble à ceci: "séparateur][nombre ...]"
// Exemple : add("[;]1;2")=3
// ATTENTION : la première ligne est facultative. tous les scénarios existants doivent encore être pris en charge.



public class StringCalculator
{
    public int add(String numbers)
    {
        String reg="[,\n]" ;
        int res=0;
        if (numbers == "" || numbers.contains(",\n")) return res;

        int first = numbers.indexOf("[");
        if(first != -1){
            int second = numbers.indexOf("]");
            String separator = numbers.substring(first + 1, second);
            if(separator != null && !separator.isEmpty()){
                reg = separator;
                numbers = numbers.substring(second+1);
            }
        }

        String[] tab = numbers.split(reg)  ;
        for ( String st: tab) {
                res= res + Integer.parseInt(st);
        }
        return res;

    }
}
