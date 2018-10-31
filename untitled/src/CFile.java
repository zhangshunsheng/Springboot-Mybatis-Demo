import java.io.*;

public class CFile {
    public void doFile() throws IOException{

        String val=null;
        File testRead=new File("C://Users//Zhang//Desktop//read.txt");
            if(!testRead.exists()){
            try{
                testRead.createNewFile();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }

        File testWrite=new File("C://Users//Zhang//Desktop//write.txt");
        if(!testWrite.exists()){
            try{
                testWrite.createNewFile();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }

        BufferedReader reader = new BufferedReader(new FileReader(testRead));
            int line=1;
        BufferedWriter bw = new BufferedWriter(new FileWriter(testWrite,false));
        while ((val = reader.readLine()) != null) {
            System.out.println(val);
            bw.write(val+"\r\n");
            line++;
        }
        reader.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args){
        try{
            new CFile().doFile();
        }
        catch(IOException e){}

    }
}
