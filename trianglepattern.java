public class trianglepattern 
{
    public static void main(String[] args)
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(i==0||j==0||i==3||j==3)
              System.out.print(j);
              else
              System.out.print(" ");
            }
            System.out.println("");

            }
        
    }
}