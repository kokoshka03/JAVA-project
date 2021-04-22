package day17_ternary_nested_conditions;
//char model = 'S';
//trim -> "Long range"
//
//
//when model 'S'
//	if trim is "long range":
//
//		"range: 412"
//		"top speed: 155 mph"
//		"0-60- 3.1sec"
//	if trim is "Plaid":
//
//		"range: 412"
//		"top speed: 155 mph"
//		"0-60- 3.1sec"
//	if trim is "Plaid+":
//
//		"range: 412"
//		"top speed: 155 mph"
//		"0-60- 3.1sec"

public class TeslaNestedIf {
    public static void main(String[] args) {
        char model ='S';
        String trim= "Long range";

        if (model == 'S') {
            if(trim =="Long range") {
                System.out.println("range: 412\n" + "top speed: 155 mph,\n" + "0-60- 3.1sec");
            }
            else if (trim == "Plaid") {
                System.out.println("range: 412,\n" + "top speed: 155 mph,\n" + "0-60- 3.1sec");
            }
            else if (trim == "Plaid+") {
                System.out.println(" range: 520,\n "  + "top speed: 200 mph,\n " + "0.60-1.99 sec");
            }else {
                System.out.println("Simple model");

            }
        }
    }
}
