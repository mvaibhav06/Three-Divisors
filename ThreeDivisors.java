public class ThreeDivisors {
    public boolean isThree(int n) {
        int counter = 2;
        for(int i=2; i<=(n/2); i++){
            if(n%i == 0){
                counter++;
            }
            if(counter>3) return false;
        }
        return counter==3;
    }
}
