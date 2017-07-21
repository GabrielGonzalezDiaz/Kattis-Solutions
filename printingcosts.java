import java.util.Scanner;


public class printingcosts {
    
    public static int cost(String str)
    {
        
        int cost = 0;
        
        for(int i=0; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ') cost += 0;
            else if(str.charAt(i) == '&') cost += 24;
            else if(str.charAt(i) == ',') cost += 7;
            else if(str.charAt(i) == '2') cost += 22;
            else if(str.charAt(i) == '8') cost += 23;
            else if(str.charAt(i) == '>') cost += 10;
            else if(str.charAt(i) == 'D') cost += 26;
            else if(str.charAt(i) == 'J') cost += 18;
            else if(str.charAt(i) == 'P') cost += 23;
            else if(str.charAt(i) == 'V') cost += 19;
            else if(str.charAt(i) == '\\') cost += 10;
            else if(str.charAt(i) == 'b') cost += 25;
            else if(str.charAt(i) == 'h') cost += 21;
            else if(str.charAt(i) == 'n') cost += 18;
            else if(str.charAt(i) == 't') cost += 17;
            else if(str.charAt(i) == 'z') cost += 19;
            else if(str.charAt(i) == '!') cost += 9;
            else if(str.charAt(i) == '\'') cost += 3;
            else if(str.charAt(i) == '-') cost += 7;
            else if(str.charAt(i) == '3') cost += 23;
            else if(str.charAt(i) == '9') cost += 26;
            else if(str.charAt(i) == '?') cost += 15;
            else if(str.charAt(i) == 'E') cost += 26;
            else if(str.charAt(i) == 'K') cost += 21;
            else if(str.charAt(i) == 'Q') cost += 31;
            else if(str.charAt(i) == 'W') cost += 26;
            else if(str.charAt(i) == ']') cost += 18;
            else if(str.charAt(i) == 'c') cost += 17;
            else if(str.charAt(i) == 'i') cost += 15;
            else if(str.charAt(i) == 'o') cost += 20;
            else if(str.charAt(i) == 'u') cost += 17;
            else if(str.charAt(i) == '{') cost += 18;
            else if(str.charAt(i) == '"') cost += 6;
            else if(str.charAt(i) == '(') cost += 12;
            else if(str.charAt(i) == '.') cost += 4;
            else if(str.charAt(i) == '4') cost += 21;
            else if(str.charAt(i) == ':') cost += 8;
            else if(str.charAt(i) == '@') cost += 32;
            else if(str.charAt(i) == 'F') cost += 20;
            else if(str.charAt(i) == 'L') cost += 16;
            else if(str.charAt(i) == 'R') cost += 28;
            else if(str.charAt(i) == 'X') cost += 18;
            else if(str.charAt(i) == '^') cost += 7;
            else if(str.charAt(i) == 'd') cost += 25;
            else if(str.charAt(i) == 'j') cost += 20;
            else if(str.charAt(i) == 'p') cost += 25;
            else if(str.charAt(i) == 'v') cost += 13;
            else if(str.charAt(i) == '|') cost += 12;
            else if(str.charAt(i) == '#') cost += 24;
            else if(str.charAt(i) == ')') cost += 12;
            else if(str.charAt(i) == '/') cost += 10;
            else if(str.charAt(i) == '5') cost += 27;
            else if(str.charAt(i) == ';') cost += 11;
            else if(str.charAt(i) == 'A') cost += 24;
            else if(str.charAt(i) == 'G') cost += 25;
            else if(str.charAt(i) == 'M') cost += 28;
            else if(str.charAt(i) == 'S') cost += 25;
            else if(str.charAt(i) == 'Y') cost += 14;
            else if(str.charAt(i) == '_') cost += 8;
            else if(str.charAt(i) == 'e') cost += 23;
            else if(str.charAt(i) == 'k') cost += 21;
            else if(str.charAt(i) == 'q') cost += 25;
            else if(str.charAt(i) == 'w') cost += 19;
            else if(str.charAt(i) == '}') cost += 18;
            else if(str.charAt(i) == '$') cost += 29;
            else if(str.charAt(i) == '*') cost += 17;
            else if(str.charAt(i) == '0') cost += 22;
            else if(str.charAt(i) == '6') cost += 26;
            else if(str.charAt(i) == '<') cost += 10;
            else if(str.charAt(i) == 'B') cost += 29;
            else if(str.charAt(i) == 'H') cost += 25;
            else if(str.charAt(i) == 'N') cost += 25;
            else if(str.charAt(i) == 'T') cost += 16;
            else if(str.charAt(i) == 'Z') cost += 22;
            else if(str.charAt(i) == '`') cost += 3;
            else if(str.charAt(i) == 'f') cost += 18;
            else if(str.charAt(i) == 'l') cost += 16;
            else if(str.charAt(i) == 'r') cost += 13;
            else if(str.charAt(i) == 'x') cost += 13;
            else if(str.charAt(i) == '~') cost += 9;
            else if(str.charAt(i) == '%') cost += 22;
            else if(str.charAt(i) == '+') cost += 13;
            else if(str.charAt(i) == '1') cost += 19;
            else if(str.charAt(i) == '7') cost += 16;
            else if(str.charAt(i) == '=') cost += 14;
            else if(str.charAt(i) == 'C') cost += 20;
            else if(str.charAt(i) == 'I') cost += 18;
            else if(str.charAt(i) == 'O') cost += 26;
            else if(str.charAt(i) == 'U') cost += 23;
            else if(str.charAt(i) == '[') cost += 18;
            else if(str.charAt(i) == 'a') cost += 23;
            else if(str.charAt(i) == 'g') cost += 30;
            else if(str.charAt(i) == 'm') cost += 22;
            else if(str.charAt(i) == 's') cost += 21;
            else if(str.charAt(i) == 'y') cost += 24;
            
            
        }
        
        return cost;
        
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext())
        {
            
            String word = scan.nextLine();
            
            System.out.println(cost(word));
            
        }
        
        scan.close();

    }

}