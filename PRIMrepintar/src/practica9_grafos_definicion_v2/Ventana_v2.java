/* UNIVERSIDAD DE PAMPLONA
    Ingeniería de Sistemas - Matemáticas discretas: Grafos
    M.Sc. Luis Armando Portilla Granados
    Actualizado octubre de 2022: ArrayList
*/
package practica9_grafos_definicion_v2;

//import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Mariana
 */
public class Ventana_v2 extends javax.swing.JFrame {
    static final int t = 20;  // tamaño
//    static Nodos_v2[] nodos = new Nodos_v2[t];
//    static Aristas_v2 aristas[] = new Aristas_v2[t*2];    
    
    static ArrayList<Nodos_v2> nodos = new ArrayList();
    static ArrayList<Aristas_v2> aristas = new ArrayList();
    static ArrayList<Nodos_v2> nodosrecorridos = new ArrayList();
    static ArrayList<Aristas_v2> aristasrecorridas = new ArrayList();
//    static int n = nodos.size();
    static int[][] matrizAd = new int[t][t]; // cambia tamaño
    static int[][] matrizIn = new int[t][t*(t-1)/2]; // posibles aristas
    int peso = 0;
    Nodos_v2 nodoSelec1 = null;
    
    Nodos_v2 nodoSelec2 = null;

    /**
     * Creates new form ventana
     */
    public Ventana_v2() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource ("/imagenes/grafoIcon.png")).getImage());
        //setLocation(400, 100);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matemáticas discretas - Grafos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Algoritmos"));

        jButton3.setText("Repintar aristas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton3)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Grafo"));
        jPanel2.setPreferredSize(new java.awt.Dimension(365, 365));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Instrucciones"));

        jLabel1.setText("NODOS:  Agrega nodos haciendo clic sobre el panel \"Grafo\""); // NOI18N

        jLabel2.setText("ARISTAS: Agrega aristas haciendo clic derecho  sobre el par de nodos que va a unir "); // NOI18N

        jLabel3.setText("PRIM: Presion el botón siguiente hasta que el algoritmo PRIM llegue a su final");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Matriz de adyacencia"));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Matriz de incidencia"));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Definición del grafo"));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(80, 117));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jButton1.setText("Nuevo grafo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Siguiente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton4))
                        .addGap(18, 18, 18))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Define a G(V,E)
    static String definicion(ArrayList<Nodos_v2> nodo, ArrayList<Aristas_v2> arista) {
        String cadena = "V = { ";
        if (!nodo.isEmpty()) {
            for (int i = 0; i < nodo.size()-1; i++) { // recorre todos los nodos sin el último
                cadena += nodo.get(i).getNombreN() + ", ";
            }
            cadena += nodo.get(nodo.size()-1).getNombreN(); // concadena el último nodo
        }
        cadena += " }\nA = { "; // cierra el conjunto V } y abre el conjungo A={ en otra línea
        if (!arista.isEmpty()) {
            for (int i = 0; i < arista.size()-1; i++) { // recorre todos las aristas sin la última
                cadena += arista.get(i).getNombreA() + ", " ;  
            }
            cadena += arista.get(arista.size()-1).getNombreA();// concadena la última arista
        }
        cadena += " }";
        return cadena;
    }
    // se encadena texto con las colmunas y filas + contenido de la matrizAd de adyacencia
    static String mostrarAd(int m[][]) {
        String cadena = "";
        char filas = 65;
        char columnas = 65;
        for (int k = 65; k < (65 + nodos.size()); k++) { //concadena títulos de columnas (A, B, ...)
            cadena += "\t" + columnas;  // 3 espacios entre columna o \t
            columnas++;
        }
        cadena += "\n";
        for (int i = 0; i < nodos.size(); i++) {
            cadena += filas + "\t";  //concadena los títulos de las filas
            for (int j = 0; j < nodos.size(); j++) {
                cadena += String.valueOf(m[i][j]) + "\t"; //contadena las relaciones (0,1) en String
            }
            filas++;
            cadena = cadena + "\n";
        }
        return (cadena);
    }
    // se encadena texto con las colmunas y filas + contenido de la matrizAd de adyacencia
    static String mostrarIn(int m[][], ArrayList<Aristas_v2> arista) {
        String cadena = "";
        char filas = 65;
        if (!arista.isEmpty()) {
            for (int i = 0; i < nodos.size(); i++) {
                cadena += "\t" + arista.get(i).getNombreA();
            }
        }
        cadena += "\n";
        for (int i = 0; i < nodos.size(); i++) {
            cadena += filas + "\t";
            for (int j = 0; j < aristas.size(); j++) {
                //Se cambió el String.valueOf para que ingrese datos de tipo entero y así comparar
                cadena += m[i][j] + "\t ";
            }
            filas++;
            cadena = cadena + "\n";
        }
        return (cadena);
    }
    static int buscaIndiceNodo(ArrayList<Nodos_v2> nodo, String h) {
        for (int i = 0; i < nodos.size(); i++) {
            //equalsIgnoreCase() Compara dos strings para ver si son iguales
            //ignorando las diferencias entre mayúsculas y minúsculas
            if (nodo.get(i).getNombreN().equalsIgnoreCase(h)) {
                return i;
            }
        }
        return -1;
    }
    static Nodos_v2 buscaNodo(ArrayList<Nodos_v2> nodo, int xx, int yy) {
        for (int i = 0; i < nodos.size(); i++) {
            int x = nodo.get(i).getX();
            int y = nodo.get(i).getY();
            int radio = nodo.get(i).getD() + 7;
            if (xx > (x - radio) && xx < (x + radio) && yy > (y - radio) && yy < (y + radio)) {
                return nodo.get(i);
            }
        }
        return null;
    }
    
    // Comprueba si existe una arista unida a dos nodos
    boolean buscarArista(Nodos_v2 n1, Nodos_v2 n2) {
        for (Aristas_v2 arista: aristas) {
            if (arista != null) {
                boolean a = arista.getN1().equals(n1), b = arista.getN2().equals(n2);
                boolean c = arista.getN2().equals(n1), d = arista.getN1().equals(n2);
                if ((a && b) || (c && d)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    // Comprueba si una arista pertenece a un nodo
//    static int comprobarNodoArista(Nodos_v2 n, Aristas_v2 a) {
//        if (a != null && a.getN1().equals(n) || a.getN2().equals(n)) {
//            return 1;
//        }
//        return 0;
//    }
    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        int x = evt.getX();
        int y = evt.getY();
        if (SwingUtilities.isLeftMouseButton(evt)) {
                if (buscaNodo(nodos, x, y) == null) {
                    Nodos_v2 nodo = new Nodos_v2(x, y, nodos.size());
                    nodo.pintarNodo(jPanel2.getGraphics());
                    nodos.add(nodo);
                    
                    jTextArea1.setText(mostrarAd(matrizAd));
                    jTextArea1.setEditable(false);
//                    jTextArea2.setText(mostrarIn(matrizIn, aristas));
//                    jTextArea2.setEditable(false);
                    jTextArea3.setText(definicion(nodos, aristas));
                    jTextArea3.setEditable(false);
                } else JOptionPane.showMessageDialog(null, "Ya existe un nodo en esta área");
        }
        if (SwingUtilities.isRightMouseButton(evt)) {
            Nodos_v2 n = buscaNodo(nodos, x, y);
            try{
            if (n != null) {
                if (nodoSelec1 == null) {
                    nodoSelec1 = n;
                } else if (nodoSelec2 == null && !n.equals(nodoSelec1)) {
                    nodoSelec2 = n;
                    // controla que no se repita la arista con un método buscarArista
                    if (!buscarArista(nodoSelec1, nodoSelec2)) {
//                        try { 
                            peso = Integer.parseInt(JOptionPane.showInputDialog("Digita el tamaño de la arista" ));
                            if(peso > 0 ){
                            int xx = buscaIndiceNodo(nodos, nodoSelec1.getNombreN());
                            int yy = buscaIndiceNodo(nodos, nodoSelec2.getNombreN());
                            
                            matrizAd[xx][yy] = peso;
                            matrizAd[yy][xx] = peso;
                            
//                            matrizIn[xx][aristas.size()] = 1;
//                            matrizIn[yy][aristas.size()] = 1;
                            Aristas_v2 arista = new Aristas_v2(nodoSelec1, nodoSelec2, peso);
                            aristas.add(arista);
                            arista.pintarArista(jPanel2.getGraphics()); // Graphics
                            //arista.pintarArista((Graphics2D) jPanel2.getGraphics());
//                        } catch (Exception e) {
//                            JOptionPane.showMessageDialog(null, "error");
//                        }
                        }else{
                             JOptionPane.showMessageDialog(null, "Digite un valor positivo ");
                             nodoSelec1 = null;
                             nodoSelec2 = null;
                             }
                    } else JOptionPane.showMessageDialog(null, "Ya existe una arista entre los nodos seleccionados");
                    
                    jTextArea1.setText(mostrarAd(matrizAd));
                    jTextArea1.setEditable(false);
                    
//                    jTextArea2.setText(mostrarIn(matrizIn, aristas));
//                    jTextArea2.setEditable(false);
                    
                    jTextArea3.setText(definicion(nodos, aristas));
                    jTextArea3.setEditable(false);
                    nodoSelec1 = null;
                    nodoSelec2 = null;
                }
            }
                
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "El peso no es valido");
           nodoSelec1 = null;
           nodoSelec2 = null;
        }
        }
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jPanel2.removeAll();
        jPanel2.repaint();
        jTextArea1.setText("");
        jTextArea2.setText("");
        jTextArea3.setText("");
        
        nodos = new ArrayList();
        aristas = new ArrayList();
        matrizAd = new int[t][t];
        matrizIn = new int[t][t*(t-1)/2];
        nodoSelec1 = null;
        nodoSelec2 = null;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            for (int i=0; i<aristas.size(); i++){
                aristas.get(i).repintarArista(jPanel2.getGraphics()); // Graphics
                //aristas[i].repintarArista((Graphics2D) jPanel2.getGraphics());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        /*//la siguiente linea manda la posición de la arista menor
        Aristas_v2 aristamenor = aristas.get(0);
        Nodos_v2 nodoexiste = null;
        Aristas_v2 aristaexiste = null;
        //Se recorre todos los nodos y encontrar el que tenga la menor arista
        for(Nodos_v2 nodo : nodos){
            //Se verifica que el nodo no esté marcado para que no haga bucle
                for(int j = 0; j<nodosrecorridos.size();j++){
                    if(nodo.getNombreN().equals(nodosrecorridos.get(j).getNombreN())){
                        nodoexiste = nodo;
                    }
                }
            
            //Se verifica que no exista la arista
            for(int a = 0; a < aristas.size();a++){
                for(int r = 0; r<nodosrecorridos.size();r++){
                    if(aristas.get(a).getNombreA().equals(aristasrecorridas.get(r).getNombreA())){
                        aristaexiste = aristas.get(a);
                    }
                }
            }
            
            //Recorremos todas las aristas
            for (int i = 0; i < aristas.size(); i++) {
                //Comparamos que la arista no enlace a un nodo que existe para que no haga bucle
                if(nodoexiste == null || !nodoexiste.getNombreN().equals(aristas.get(i).getN1().getNombreN()) || !nodoexiste.getNombreN().equals(aristas.get(i).getN2().getNombreN())){
                //Comparamos que la arista no exista
                if(aristaexiste == null || !aristaexiste.getNombreA().equals(aristas.get(i).getNombreA())){
                //Comparamos la posicion del nodo k con el nombre de la arista
                if(nodo.getNombreN().equals(aristas.get(i).getN1().getNombreN()) || nodo.getNombreN().equals(aristas.get(i).getN2().getNombreN())){
                    //Se guarda la arista de menor tamaño 
                    if(aristamenor.getPeso() >= aristas.get(i).getPeso()){
                        aristamenor = aristas.get(i);
                                }
                            }  
                        }
                    }
                }
            aristamenor.repintarArista(jPanel2.getGraphics());
            nodosrecorridos.add(aristamenor.getN1());
            nodosrecorridos.add(aristamenor.getN2());
            aristasrecorridas.add(aristamenor);

            break;
        //JOptionPane.showMessageDialog(null, aristamenor.getPeso());
        }*/
        
        //Recorriendo la matriz
        /*String empieza = null;
        Nodos_v2 nodoempieza = null;
        if(f == 0){
        empieza = JOptionPane.showInputDialog(null, "¿Desde que nodo desea empezar?"); 
        }
        for(int h = 0; h<nodos.size();h++){
            if(nodos.get(h).getNombreN().equals(empieza.toUpperCase())){
                nodoempieza = nodos.get(h);
            }
        }
        if(f==0){
        nodosrecorridos.add(nodoempieza);
        f++;
        }*/
        //Se añade la primera posición para empezar
        nodosrecorridos.add(nodos.get(0));
        Aristas_v2 aristamenor = null;
        for (int i = 0; i < nodos.size();i++){		// El primer índice recorre las filas de nodos
            for (int j = 0; j < nodos.size(); j++){	// El segundo índice recorre las columnas de nodos
                if(matrizAd[i][j]!= 0){                 //Verifica que no entre en una posición en donde no existe arista o la posición sea 0
                    if(nodosrecorridos.contains(nodos.get(j))){ //Aquí toma todos los posibles caminos dependiendo de cuales caminos se abran mediante los nodos
                for(int k = 0; k<aristas.size();k++){   //Recorre todas las aristas
                        //Comprueba que el nodo que entre no haya sido visitado para no formar bucles
                        if(!nodosrecorridos.contains(aristas.get(k).getN1()) || !nodosrecorridos.contains(aristas.get(k).getN2())){
                            //Confirma que el nodo j sea igual a la arista y así entra en el if
                        if(nodos.get(j).getNombreN().equals(aristas.get(k).getN1().getNombreN()) || nodos.get(j).getNombreN().equals(aristas.get(k).getN2().getNombreN())){
                            if(!aristasrecorridas.contains(aristas.get(k))){ //Verifica que no entre en una arista que ya ha sido pintada 
                                if( aristamenor == null ){
                                    aristamenor = aristas.get(k);
                                }
                                else{
                                    if(aristas.get(k).getPeso() <= aristamenor.getPeso()){ 
                                        aristamenor = aristas.get(k); //Busca la arista de menor tamaño entre ese nodo
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
	}
        aristamenor.repintarArista(jPanel2.getGraphics());
        nodosrecorridos.add(aristamenor.getN1()); // Añade el nodo al Array de nodos recorridos
        nodosrecorridos.add(aristamenor.getN2());
        aristasrecorridas.add(aristamenor); //Añade la arista al Array de listas recorridas
        
        //Se comprueba si todos los nodos han sido visitados
        if(aristasrecorridas.size() == nodos.size()-1){
            JOptionPane.showMessageDialog(null, "Todos los nodos han sido visitados");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_v2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
