package hw1;
public class Cryptarithmetic {
    public static void main(String[] args) {
        for (int T = 0; T <= 9; T++) {
            for (int O = 0; O <= 9; O++) {
                for (int G = 0; G <= 9; G++) {
                    for (int D = 0; D <= 9; D++)
                        if (T != O && T != G && T != D && O != G && O != D && G != D && T != 0 && O != 0 && G != 0 && D != 0) {
                            int too = T *100 + O *10 + O;
                            int sum = G *1000 + O *100 + O *10 + D;
                            if (4*too == sum) {
                                System.out.println("t: " + T + ", o: " + O + ", g: " + G + ", d: " + D);
                            return;
                            }
                        }
                }
            }
        }
    }
}
