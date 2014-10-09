
/*
UVG
Algoritmos y Estructuras de Datos - 2011
Hoja de trabajo 7
Autor: Eduardo Castellanos
WordTyperCounter.java
Descripci�n: Programa principal. 
*/


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class WordTypeCounter {
    public static void main(String[] args) throws Exception{       
        args=new String[]{"files/words.txt","files/text.txt","2"};
        if(args.length > 1)
        {
            /*
             * InicializaciÃ³n de variables. Word es el archivo con las definiciones y text el texto a analizar
             */
            File word = new File(args[0]);
            File text = new File(args[1]);

            /*
             * Implementada sera el tercer parÃ¡metro y indica la implementaciÃ³n a utilizar.
             */
            int implementada = Integer.parseInt(args[2]);

            /*
             * Nos permitirÃ¡n analizar los textos
             */
            BufferedReader wordReader;
            BufferedReader textReader;

            int verbos=0,sustantivos=0,adjetivos=0,adverbios=0,gerundios=0;
            long inicio,end;

            /*
             * Se realiza el proceso unicamente si se han indicado en los parametros los archivos y si existen
             */
            if(word.isFile() && text.isFile()) 
            {
                /*
                 * Se leen los archivos
                 */
                try
                {
                    wordReader = new BufferedReader(new FileReader(word));
                    textReader = new BufferedReader(new FileReader(text));
                }
                catch (Exception ex)
                {
                    System.out.println("No se han leÃ­do correctamente los archivos.");
                    return;
                }

                /*
                 * Se crea un WordSet para guardar las palabras y se envÃ­a la implementaciÃ³n
                 */
                WordSet palabras =  WordSetFactory.generateSet(implementada);

                String linea = null;
                String[] partesPalabra;

                inicio = System.currentTimeMillis();
                linea = wordReader.readLine();
                /*
                 * Se lee el archivo con las palabras y se carga al WordSet
                 */
                while(linea!=null)
                {
                    /*
                     * Entre comillas es expresion irregular
                     */
                    partesPalabra = linea.split("\\.");
                    if(partesPalabra.length == 2)
                        palabras.add(new Word(partesPalabra[0].trim(),partesPalabra[1].trim()));
                    linea = wordReader.readLine();
                }
                wordReader.close();
                end = System.currentTimeMillis();

                System.out.println("Palabras cargadas en " + (end-inicio) + " ms.");

                inicio = System.currentTimeMillis();
                linea = textReader.readLine();
                String[] textParts;
                Word normal;
                Word busqueda = new Word();

                while(linea!=null)
                {
                    /*
                     * Separa las palabras e cada lÃ­nea
                     */
                    textParts = linea.split("[^\\w-]+");

                    /*
                     * Se analiza cada palabra para colocar su tipo
                     */
                    for(int i=0;i<textParts.length;i++)
                    {
                        busqueda.setWord(textParts[i].trim().toLowerCase());
                        normal = palabras.get(busqueda);
                        if(normal != null)
                        {
                            if(normal.getType().equals("v-d") || normal.getType().equals("v") || normal.getType().equals("q"))
                                verbos++;
                            else if(normal.getType().equals("g") )
                                gerundios++;
                            else if(normal.getType().equals("a-s") || normal.getType().equals("a-c") || normal.getType().equals("a"))
                                adjetivos++;
                            else if(normal.getType().equals("e"))
                                adverbios++;
                            else 
                                sustantivos++;
                        }
                    }
                    linea = textReader.readLine();
                }
                textReader.close();
                
                /*
                 * Se presentan los resultados
                 */
                end = System.currentTimeMillis();
                System.out.println("Se ha anlizado el texto en " + (end-inicio) + " ms.\n----------------------------\n"
                        + "El texto analizado tiene: \n -"
                        + verbos + " verbos\n -"
                        + sustantivos + " sustantivos\n -"
                        + adjetivos + " adjetivos\n -"
                        + adverbios + " adverbios\n -"
                        + gerundios + " gerundios\n -");
            }
            else
                System.out.println("No se han podido encontrar los archivos");
        }
        else
                System.out.println("No ha ingresado todos los parÃ¡metros necesarios para realizar el proceso.");
    }
}