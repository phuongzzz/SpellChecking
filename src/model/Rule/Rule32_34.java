package model.Rule;

/**
 * Created by katie on 15/03/2017.
 */
public class Rule32_34 extends Rule{
    public boolean isValid(String x) {
        String nguyenam = "eyio"
            + "èéẹẻẽ"+"ê"+"ềếệễể"
            + "ùúụủũ" + "ư" + "ừứựửữ"
            + "ìíịỉĩ"
            + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
            + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
            + "ỳýỵỷỹ"
            ;
        String phuamkhongdivs_ì = "q r s d g h k l x v b đ";
        for(int i=0;i<x.length()-1;i++){
            if("ị".contains(x.charAt(i)+"")){
               if(nguyenam.contains(x.charAt(i+1)+""))
                   return false;
               if(phuamkhongdivs_ì.contains(x.charAt(i+1)+""))
                   return false;
            }
        }

        return true;
    }

    public String ShowError() {
        return ("Rule32_34:Các nguyên âm được phép sau nguyên âm \"ị\": ịu, ịa," +
                "Các nguyên âm được phép sau nguyên âm \"í\": íu, ía, ");
    }
}
