import javax.swing.*; /*Es una biblioteca gráfica para Java. 
Incluye widgets para interfaz gráfica de usuario tales como cajas de texto, 
botones, listas desplegables y tablas. */

public class Ventana extends JFrame{ /*JFrame es una biblioteca gráfica para Java. Incluye widgets 
para interfaz gráfica de usuario tales como cajas de texto, botones, listas desplegables y tablas. */
    
    private JLabel etiqueta; /*Declarar etiqueta */
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    private JLabel etiqueta4;
    private JLabel etiqueta5;
    private JLabel etiqueta6;
    private JLabel etiqueta7;

    private JTextField texto; /*Declarar un caja de texto */
    private JTextField texto2;
    private JTextField texto3;
    private JTextField texto4;
    private JTextField texto5;
    private JTextField texto6;
    private JTextField texto7;

    public Ventana(){ /*Aquí se asignan las propiedades de nuestra etiqueta y nuestra ventana*/
        setTitle("Bienvenido");
        setLayout(null); /*Habilitar la ventana para editar*/

        etiqueta = new JLabel("NOMBRE"); /*Constructor etiqueta*/
        etiqueta.setBounds(40,20,100,35);
        add(etiqueta);

        etiqueta2 = new JLabel("EDAD"); /*Constructor etiqueta*/
        etiqueta2.setBounds(40,80,100,35);
        add(etiqueta2);

        etiqueta3 = new JLabel("OCUPACIÓN"); /*Constructor etiqueta*/
        etiqueta3.setBounds(40,140,100,35);
        add(etiqueta3);

        etiqueta4 = new JLabel("PAÍS DE ORIGEN"); /*Constructor etiqueta*/
        etiqueta4.setBounds(40,200,150,35);
        add(etiqueta4);

        etiqueta5 = new JLabel("E-MAIL"); /*Constructor etiqueta*/
        etiqueta5.setBounds(40,260,150,35);
        add(etiqueta5);

        etiqueta6 = new JLabel("HOBBY"); /*Constructor etiqueta*/
        etiqueta6.setBounds(40,320,150,35);
        add(etiqueta6);

        etiqueta7 = new JLabel("N° DE CELULAR"); /*Constructor etiqueta*/
        etiqueta7.setBounds(40,380,150,35);
        add(etiqueta7);


        
        texto = new JTextField(""); /*Constructor caja de texto */
        texto.setBounds(210,20,250,35);
        add(texto);

        texto2 = new JTextField(""); /*Constructor caja de texto */
        texto2.setBounds(210,80,250,35);
        add(texto2);

        texto3 = new JTextField(""); /*Constructor caja de texto */
        texto3.setBounds(210,140,250,35);
        add(texto3);

        texto4 = new JTextField(""); /*Constructor caja de texto */
        texto4.setBounds(210,200,250,35);
        add(texto4);

        texto5 = new JTextField(""); /*Constructor caja de texto */
        texto5.setBounds(210,260,250,35);
        add(texto5);

        texto6 = new JTextField(""); /*Constructor caja de texto */
        texto6.setBounds(210,320,250,35);
        add(texto6);

        texto7 = new JTextField(""); /*Constructor caja de texto */
        texto7.setBounds(210,380,250,35);
        add(texto7);
    }

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setBounds(0,0,500,700);/*Medidas de la ventana */
        ventana.setVisible(true);/*Hacerla visible */
        ventana.setLocationRelativeTo(null); /*Centrar ventana */        
    }
}