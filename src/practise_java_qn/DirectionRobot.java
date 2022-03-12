public class DirectionRobot {
 

//  "G": go straight 1 unit;
// "L": turn 90 degrees to the left;
// "R": turn 90 degrees to the right.



    public static boolean isRobotBounded(String instructions) {
        int x=0,y=0;
        
        char dir = 'N';
        
        for(char ch : instructions.toCharArray()){
            if(ch=='G'){
                if(dir == 'N') y++;
                else if(dir=='S') y--;
                else if(dir=='E') x++;
                else x--;
            }else if(ch=='L'){
                if(dir=='N') dir='W';
                else if( dir=='W') dir='S';               
                else if( dir=='S') dir='E';
                else dir='N';

            }else if(ch=='R'){
                if(dir=='N') dir='E';
                else if( dir=='E') dir='S';               
                else if( dir=='S') dir='W';
                else dir='N';

            }
        }
        if (x == 0 && y == 0)  //CHECK at last robot is in the circle 
            return true;
        if(dir=='N'){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "GGLLGG";   //"RGGGLGLLLLGLRGRLGGRLLRRRL" //"GLGL"  
        System.out.println(isRobotBounded(s));
    }
}
