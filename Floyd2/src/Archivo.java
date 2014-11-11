import java.io.*;


public class Archivo{
   
    File archivo;
    FileReader fr;
    BufferedReader br;
    FileWriter fw;
    PrintWriter pw;
    InterfazGrafo grafo = new GraphMatrix();

    public void obtenerArchivo(String direccion) throws FileNotFoundException{
       archivo=new File(direccion);
    }  
   
  
    public InterfazGrafo arregloNombres() throws IOException{
        // Lectura del fichero
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);
        String linea;
        while((linea=br.readLine())!=null){
            String[] tmp = new String[2];
            tmp=linea.split(" ");
            grafo.add(tmp[0]);
            grafo.add(tmp[1]);
        }
        return grafo;
    }
   
 
    public void write(String cadena) throws IOException{
        fw = new FileWriter(archivo);
        pw = new PrintWriter(fw);
        pw.println(cadena);
    }
   
  
    public InterfazGrafo matrizCostos() throws IOException{
        // Lectura del fichero
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);
        String linea;

        while((linea=br.readLine())!=null){
            String[] tmp;
            tmp=linea.split(" ");
            grafo.addEdge(tmp[0], tmp[1], tmp[2]);
        }
        return grafo;
    }
   

}

