package arraylist;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaBuscarAlumno extends javax.swing.JFrame {

    //BASE DE DATOS
    List<Alumno> alumnos_al = new ArrayList<>();
    DefaultListModel<String> modeloLista1 = new DefaultListModel<>();
    DefaultListModel<String> modeloLista2 = new DefaultListModel<>();
    DefaultListModel<String> modeloLista3 = new DefaultListModel<>();
    DefaultListModel<String> modeloLista4 = new DefaultListModel<>();
    ButtonGroup edad = new ButtonGroup();
    
    public VentanaBuscarAlumno() {
        initComponents();
        personalizarVentana();
        anadirPorDefecto();
        lstAsignaturas.setModel(modeloLista1);
        lstAsignaturaID.setModel(modeloLista2);
        lstAsignaturaID1.setModel(modeloLista3);
        llenarComboBox();
        edad.add(rdMenor);
        edad.add(rdMayor);
        pintarAlumno(0);
        jlAsignaturas.setModel(modeloLista4);

    }

    public void pintarAlumno(int indice) {
    Alumno alumno = alumnos_al.get(indice);
    txtIdNavegar.setText(alumno.getIdAlumno());
    txtNombreNavegar.setText(alumno.getNombre());
    txtApellidoNavegar.setText(alumno.getApellido());
    txtEdadNavegar.setText(alumno.getEdad() + "");
    List<String> asignaturas_al = alumno.getAsignaturas_al();
    modeloLista4.clear();
    for (String s: asignaturas_al) {
    modeloLista4.addElement(s);
    }
    }
    
    public void llenarComboBox() {
     cboMostrarNumeros.addItem("");
        for (Alumno alumno: alumnos_al) {
        cboMostrarNumeros.addItem(alumno.getIdAlumno());

        }
    }

    public void anadirPorDefecto() {

        List<String> asignaturas_al = new ArrayList<>();
        asignaturas_al.add("Física");
        asignaturas_al.add("Química");

        Alumno alumno1 = new Alumno("A1", "Luis", "Roncal", 15, asignaturas_al);

        /*List<String> asignaturas1_al = new ArrayList<>();
        asignaturas1_al.add("Física");

        Alumno alumno1 = new Alumno("A2", "Luis", "Lescano", 17, asignaturas1_al);

        alumnos_al.add(alumno);
        alumnos_al.add(alumno1);*/
        Alumno alumno2 = new Alumno("A2", "Miguel", "Alva", 17, new ArrayList<>(Arrays.asList("Religión", "Matemática", "Física", "Química")));
        Alumno alumno3 = new Alumno("A3", "Luis", "Zuñiga", 18, new ArrayList<>(Arrays.asList("Literatura", "Matemática", "Física", "Química")));
        Alumno alumno4 = new Alumno("A4", "Carmen", "Cuba", 19, new ArrayList<>(Arrays.asList("Arte", "Matemática", "Física", "Química")));
        Alumno alumno5 = new Alumno("A5", "María", "Rodriguez", 18, new ArrayList<>(Arrays.asList("Arte", "Matemática", "Física", "Química")));
        Alumno alumno6 = new Alumno("A6", "Arturo", "Alcantara", 17, new ArrayList<>(Arrays.asList("Arte", "Matemática", "Química")));
        Alumno alumno7 = new Alumno("A7", "Ismael", "Lescano", 16, new ArrayList<>(Arrays.asList("Arte", "Matemática", "Historia", "Laboral")));
        Alumno alumno8 = new Alumno("A8", "Julieta", "Jauregui", 15, new ArrayList<>(Arrays.asList("Arte", "Matemática", "Ciencias Naturales", "Laboral")));
        Alumno alumno9 = new Alumno("A9", "Silvia", "Jauregui", 15, new ArrayList<>(Arrays.asList("Arte", "Biología", "Ciencias Naturales", "Laboral")));
        Alumno alumno10 = new Alumno("A10", "Luis", "Párraga", 16, new ArrayList<>(Arrays.asList("Arte", "Biología", "Historia", "Laboral")));

        alumnos_al.add(alumno1);
        alumnos_al.add(alumno2);
        alumnos_al.add(alumno3);
        alumnos_al.add(alumno4);
        alumnos_al.add(alumno5);
        alumnos_al.add(alumno6);
        alumnos_al.add(alumno7);
        alumnos_al.add(alumno8);
        alumnos_al.add(alumno9);
        alumnos_al.add(alumno10);
    }

    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("image/cross1.png");
        Image image = icono.getImage();
        this.setIconImage(image);//Cambiar el icono de la ventana

        this.setTitle("CRUD");
        this.setResizable(false); //true se redimensiona, false No se redimensiona
        this.setLocationRelativeTo(null);//Colocar la ventana en el centro de la pantalla

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpPESTANIA = new javax.swing.JTabbedPane();
        jpID = new javax.swing.JPanel();
        lblIdAlumno = new javax.swing.JTextField();
        txtIdAlumno = new javax.swing.JTextField();
        cmdBuscarId = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtTodo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstAsignaturaID = new javax.swing.JList();
        cmdNuevo = new javax.swing.JButton();
        jpNombre = new javax.swing.JPanel();
        txtBuscarNombre = new javax.swing.JTextField();
        lblBuscarNombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMostrarNombres = new javax.swing.JTextArea();
        ButtonBuscarNombre = new javax.swing.JButton();
        ButtonNuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstAsignaturas = new javax.swing.JList<>();
        jpAlumnosxAsignatura = new javax.swing.JPanel();
        lblAsignatura = new javax.swing.JLabel();
        txtAsignatura = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txaMostrarAlumnos = new javax.swing.JTextArea();
        botBuscar = new javax.swing.JButton();
        botNuevo = new javax.swing.JButton();
        jpCombobox = new javax.swing.JPanel();
        cboMostrarNumeros = new javax.swing.JComboBox<>();
        lblIdAlumno1 = new javax.swing.JTextField();
        txtTodo1 = new javax.swing.JTextField();
        txtNombre1 = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtEdad1 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstAsignaturaID1 = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        rdMenor = new javax.swing.JRadioButton();
        rdMayor = new javax.swing.JRadioButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        txaMostrarEdades = new javax.swing.JTextArea();
        cmdNuevoEdad = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblAsignaturas = new javax.swing.JLabel();
        txtIdNavegar = new javax.swing.JTextField();
        txtNombreNavegar = new javax.swing.JTextField();
        txtApellidoNavegar = new javax.swing.JTextField();
        txtEdadNavegar = new javax.swing.JTextField();
        botIzquierdo = new javax.swing.JButton();
        botDerecho = new javax.swing.JButton();
        botInicio = new javax.swing.JButton();
        botFin = new javax.swing.JButton();
        txtContador = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jlAsignaturas = new javax.swing.JList<>();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 700));
        setPreferredSize(new java.awt.Dimension(600, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(550, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtpPESTANIA.setPreferredSize(new java.awt.Dimension(581, 600));

        jpID.setPreferredSize(new java.awt.Dimension(581, 600));

        lblIdAlumno.setEditable(false);
        lblIdAlumno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblIdAlumno.setText("INGRESAR IDALUMNO (EJEMPLO A1)");

        cmdBuscarId.setText("BUSCAR");
        cmdBuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarIdActionPerformed(evt);
            }
        });

        txtNombre.setEditable(false);

        txtApellido.setEditable(false);

        txtEdad.setEditable(false);

        txtTodo.setEditable(false);

        jScrollPane3.setViewportView(lstAsignaturaID);

        cmdNuevo.setText("NUEVO");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpIDLayout = new javax.swing.GroupLayout(jpID);
        jpID.setLayout(jpIDLayout);
        jpIDLayout.setHorizontalGroup(
            jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIDLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpIDLayout.createSequentialGroup()
                        .addComponent(cmdBuscarId, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jpIDLayout.createSequentialGroup()
                            .addComponent(lblIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(64, 64, 64)
                            .addComponent(txtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTodo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpIDLayout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpIDLayout.setVerticalGroup(
            jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIDLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpIDLayout.createSequentialGroup()
                        .addComponent(txtTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdBuscarId)
                    .addComponent(cmdNuevo))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jtpPESTANIA.addTab("ID", jpID);

        jpNombre.setPreferredSize(new java.awt.Dimension(581, 600));

        txtBuscarNombre.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtBuscarNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarNombreActionPerformed(evt);
            }
        });

        lblBuscarNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscarNombre.setText("Buscar por Nombre");

        txaMostrarNombres.setEditable(false);
        txaMostrarNombres.setColumns(20);
        txaMostrarNombres.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txaMostrarNombres.setForeground(new java.awt.Color(51, 102, 255));
        txaMostrarNombres.setRows(5);
        jScrollPane1.setViewportView(txaMostrarNombres);

        ButtonBuscarNombre.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        ButtonBuscarNombre.setText("BUSCAR");
        ButtonBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarNombreActionPerformed(evt);
            }
        });

        ButtonNuevo.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        ButtonNuevo.setText("NUEVO");
        ButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNuevoActionPerformed(evt);
            }
        });

        lstAsignaturas.setForeground(new java.awt.Color(0, 51, 255));
        jScrollPane2.setViewportView(lstAsignaturas);

        javax.swing.GroupLayout jpNombreLayout = new javax.swing.GroupLayout(jpNombre);
        jpNombre.setLayout(jpNombreLayout);
        jpNombreLayout.setHorizontalGroup(
            jpNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNombreLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(jpNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpNombreLayout.createSequentialGroup()
                        .addComponent(lblBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpNombreLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNombreLayout.createSequentialGroup()
                        .addComponent(ButtonBuscarNombre)
                        .addGap(159, 159, 159)
                        .addComponent(ButtonNuevo)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jpNombreLayout.setVerticalGroup(
            jpNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNombreLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addGap(55, 55, 55)
                .addGroup(jpNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonBuscarNombre)
                    .addComponent(ButtonNuevo))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jtpPESTANIA.addTab("Nombre", jpNombre);

        lblAsignatura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAsignatura.setText("INGRESE ASIGNATURA");

        txtAsignatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txaMostrarAlumnos.setColumns(20);
        txaMostrarAlumnos.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txaMostrarAlumnos.setRows(5);
        jScrollPane4.setViewportView(txaMostrarAlumnos);

        botBuscar.setText("BUSCAR");
        botBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botBuscarActionPerformed(evt);
            }
        });

        botNuevo.setText("NUEVO");
        botNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpAlumnosxAsignaturaLayout = new javax.swing.GroupLayout(jpAlumnosxAsignatura);
        jpAlumnosxAsignatura.setLayout(jpAlumnosxAsignaturaLayout);
        jpAlumnosxAsignaturaLayout.setHorizontalGroup(
            jpAlumnosxAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAlumnosxAsignaturaLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jpAlumnosxAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addGroup(jpAlumnosxAsignaturaLayout.createSequentialGroup()
                        .addComponent(lblAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txtAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpAlumnosxAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jpAlumnosxAsignaturaLayout.setVerticalGroup(
            jpAlumnosxAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAlumnosxAsignaturaLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jpAlumnosxAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAsignatura)
                    .addComponent(txtAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botBuscar))
                .addGap(18, 18, 18)
                .addGroup(jpAlumnosxAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botNuevo)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jtpPESTANIA.addTab("Alumnos por Asignatura", jpAlumnosxAsignatura);

        cboMostrarNumeros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboMostrarNumerosItemStateChanged(evt);
            }
        });
        cboMostrarNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMostrarNumerosActionPerformed(evt);
            }
        });

        lblIdAlumno1.setEditable(false);
        lblIdAlumno1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblIdAlumno1.setText("SELECCIONAR IDALUMNO");

        txtTodo1.setEditable(false);

        txtNombre1.setEditable(false);

        txtApellido1.setEditable(false);

        txtEdad1.setEditable(false);

        jScrollPane5.setViewportView(lstAsignaturaID1);

        javax.swing.GroupLayout jpComboboxLayout = new javax.swing.GroupLayout(jpCombobox);
        jpCombobox.setLayout(jpComboboxLayout);
        jpComboboxLayout.setHorizontalGroup(
            jpComboboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComboboxLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lblIdAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboMostrarNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
            .addGroup(jpComboboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpComboboxLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(jpComboboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTodo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpComboboxLayout.createSequentialGroup()
                            .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(63, 63, 63)
                            .addComponent(txtEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(12, 12, 12)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );
        jpComboboxLayout.setVerticalGroup(
            jpComboboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComboboxLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jpComboboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboMostrarNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(jpComboboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpComboboxLayout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addGroup(jpComboboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpComboboxLayout.createSequentialGroup()
                            .addComponent(txtTodo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jpComboboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(44, Short.MAX_VALUE)))
        );

        jtpPESTANIA.addTab("ID COMBOBOX", jpCombobox);

        rdMenor.setText("MENOR (18)");
        rdMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMenorActionPerformed(evt);
            }
        });

        rdMayor.setText("MAYOR (18)");
        rdMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMayorActionPerformed(evt);
            }
        });

        txaMostrarEdades.setColumns(20);
        txaMostrarEdades.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txaMostrarEdades.setRows(5);
        jScrollPane6.setViewportView(txaMostrarEdades);

        cmdNuevoEdad.setText("NUEVO");
        cmdNuevoEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoEdadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdMenor)
                                .addGap(88, 88, 88)
                                .addComponent(rdMayor))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(cmdNuevoEdad)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdMenor)
                    .addComponent(rdMayor))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmdNuevoEdad)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jtpPESTANIA.addTab("EDAD RADIOBUTTON", jPanel1);

        lblID.setText("ID");

        lblNombre.setText("NOMBRE");

        lblApellido.setText("APELLIDO");

        lblEdad.setText("EDAD");

        lblAsignaturas.setText("ASIGNATURAS");

        txtIdNavegar.setEditable(false);

        txtNombreNavegar.setEditable(false);

        txtApellidoNavegar.setEditable(false);

        txtEdadNavegar.setEditable(false);

        botIzquierdo.setText("<<");
        botIzquierdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botIzquierdoActionPerformed(evt);
            }
        });

        botDerecho.setText(">>");
        botDerecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botDerechoActionPerformed(evt);
            }
        });

        botInicio.setText("INICIO");
        botInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botInicioActionPerformed(evt);
            }
        });

        botFin.setText("FIN");
        botFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botFinActionPerformed(evt);
            }
        });

        txtContador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContador.setText("0");

        jScrollPane7.setViewportView(jlAsignaturas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botIzquierdo)
                        .addGap(18, 18, 18)
                        .addComponent(botInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtContador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(botFin)
                        .addGap(18, 18, 18)
                        .addComponent(botDerecho))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblApellido)
                                    .addComponent(lblNombre)
                                    .addComponent(lblEdad))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblID)
                                .addGap(60, 60, 60)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdNavegar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdadNavegar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoNavegar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreNavegar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(lblAsignaturas)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblID))
                            .addComponent(txtIdNavegar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombreNavegar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblApellido)
                                    .addComponent(txtApellidoNavegar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lblEdad))
                            .addComponent(txtEdadNavegar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblAsignaturas)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botIzquierdo)
                    .addComponent(botInicio)
                    .addComponent(botFin)
                    .addComponent(botDerecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtContador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jtpPESTANIA.addTab("NAVEGAR X ALUMNO", jPanel2);

        getContentPane().add(jtpPESTANIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 57, 585, 353));

        lblTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(153, 153, 153));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("BUSCAR");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 591, 51));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarIdActionPerformed
        String idAlumno = txtIdAlumno.getText().toLowerCase().trim();
        boolean encontro = false;
        if (alumnos_al.size() > 0) {
            for (Alumno a : alumnos_al) {
                if (a.getIdAlumno().toLowerCase().equals(idAlumno)) {
                    encontro = true;
                    txtTodo.setText(a.toString());
                    txtNombre.setText(a.getNombre());
                    txtApellido.setText(a.getApellido());
                    txtEdad.setText(a.getEdad() + "");
                    List<String> asignaturas_al = a.getAsignaturas_al();
                    for (String asig : asignaturas_al) {
                        modeloLista2.addElement(asig);
                    }
    }//GEN-LAST:event_cmdBuscarIdActionPerformed

            }
        } else {
            JOptionPane.showMessageDialog(null, "LISTA ALUMNOS VACIA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        if (!encontro) {
            JOptionPane.showMessageDialog(null, "ALUMNO NO EXISTE", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        cmdBuscarId.setEnabled(false);
    }

    private void ButtonBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarNombreActionPerformed
        txaMostrarNombres.setText("");
        String nombre = txtBuscarNombre.getText();

        List<Alumno> alumnosaux_al = obtenerListaNombres(nombre);
        if (alumnosaux_al.size() > 0) {
            txaMostrarNombres.append(Alumno.cabecera());
            txaMostrarNombres.append(Alumno.subrrayadoCabecera());
            for (Alumno a : alumnosaux_al) {
                //txaMostrarNombres.append(a.toString() + "\n");
                txaMostrarNombres.append(a.cuerpo());
                List<String> asignaturas_al = a.getAsignaturas_al();
                for (String asi : asignaturas_al) {
                    modeloLista1.addElement(asi);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO EXISTEN ALUMNOS CON DICHO NOMBRE", "ERROR", JOptionPane.ERROR_MESSAGE);

        }
        ButtonBuscarNombre.setEnabled(false);
    }//GEN-LAST:event_ButtonBuscarNombreActionPerformed

    private void txtBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarNombreActionPerformed
        txaMostrarNombres.setText("");
        String nombre = txtBuscarNombre.getText();

        List<Alumno> alumnosaux_al = obtenerListaNombres(nombre);
        if (alumnosaux_al.size() > 0) {
            txaMostrarNombres.append(Alumno.cabecera());
            txaMostrarNombres.append(Alumno.subrrayadoCabecera());
            for (Alumno a : alumnosaux_al) {
                //txaMostrarNombres.append(a.toString() + "\n");
                txaMostrarNombres.append(a.cuerpo());

            }

        } else {
            JOptionPane.showMessageDialog(null, "NO EXISTEN ALUMNOS CON DICHO NOMBRE", "ERROR", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_txtBuscarNombreActionPerformed

    private void ButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNuevoActionPerformed
        txtBuscarNombre.setText("");
        txaMostrarNombres.setText("");
        modeloLista1.clear();
        ButtonBuscarNombre.setEnabled(true);
    }//GEN-LAST:event_ButtonNuevoActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        txtIdAlumno.setText("");
        txaMostrarNombres.setText("");
        txtTodo.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        modeloLista2.clear();
        cmdBuscarId.setEnabled(true);
    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void botBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botBuscarActionPerformed
        String asignatura = txtAsignatura.getText().toLowerCase().trim(); //QUE VA A BUSCAR EN LA CAJA EL USUARIO trim es para limpiar los espacios en blanco
        int encontrado = 0;
        int i = 0;
        for (Alumno a : alumnos_al) {
            List<String> asignaturas_al = a.getAsignaturas_al();
            for (String asig : asignaturas_al) {
                if (asig.toLowerCase().equals(asignatura)) {
                    if (i == 0) {
                        txaMostrarAlumnos.append(Alumno.cabecera());
                        txaMostrarAlumnos.append(Alumno.subrrayadoCabecera());
                        i++;

                    }
                    txaMostrarAlumnos.append(a.cuerpo());
                    encontrado++;
                    break;
                }
            }
        }
        if (encontrado == 0) {
            JOptionPane.showMessageDialog(null, "NO HAY ALUMNOS CURSANDO ESTA ASIGNATURA", "ERROR", JOptionPane.ERROR_MESSAGE);

        }
        botBuscar.setEnabled(false);
    }//GEN-LAST:event_botBuscarActionPerformed

    private void botNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botNuevoActionPerformed
        txtAsignatura.setText("");
        txaMostrarAlumnos.setText("");
        botBuscar.setEnabled(true);

    }//GEN-LAST:event_botNuevoActionPerformed

    private void cboMostrarNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMostrarNumerosActionPerformed
        String idAlumno = (String) cboMostrarNumeros.getSelectedItem();
        //System.out.println(idAlumno);
        //txtIdAlumno.setText(idAlumno);

    }//GEN-LAST:event_cboMostrarNumerosActionPerformed

    private void cboMostrarNumerosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboMostrarNumerosItemStateChanged
         String idAlumno = (String) cboMostrarNumeros.getSelectedItem();
        boolean encontro = false;
        if (alumnos_al.size() > 0) {
            for (Alumno a : alumnos_al) {
                if (a.getIdAlumno().equals(idAlumno)) {
                    encontro = true;
                    txtTodo1.setText(a.toString());
                    txtNombre1.setText(a.getNombre());
                    txtApellido1.setText(a.getApellido());
                    txtEdad1.setText(a.getEdad() + "");
                    List<String> asignaturas_al = a.getAsignaturas_al();
                    modeloLista3.clear();
                    for (String asig : asignaturas_al) {
                    modeloLista3.addElement(asig);
                        
                    }
                }
            }
        }

    }//GEN-LAST:event_cboMostrarNumerosItemStateChanged

    private void rdMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMenorActionPerformed
        txaMostrarEdades.setText("");
        for(Alumno a: alumnos_al) {
            if (a.getEdad()<18) {
                txaMostrarEdades.append(a.cuerpo());
            }
        }
    }//GEN-LAST:event_rdMenorActionPerformed

    private void rdMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMayorActionPerformed
        txaMostrarEdades.setText("");
        for(Alumno a: alumnos_al) {
            if (a.getEdad()>=18) {
                txaMostrarEdades.append(a.cuerpo());
            }
        }
    }//GEN-LAST:event_rdMayorActionPerformed

    private void cmdNuevoEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoEdadActionPerformed
        txaMostrarEdades.setText("");
    }//GEN-LAST:event_cmdNuevoEdadActionPerformed

    private void botIzquierdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botIzquierdoActionPerformed
        String indices = txtContador.getText();
        int indicei = Integer.parseInt(indices);
        if (indicei > 0) {
            indicei--;
            txtContador.setText(indicei + "");
            pintarAlumno(indicei);
            
        }
    }//GEN-LAST:event_botIzquierdoActionPerformed

    private void botDerechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botDerechoActionPerformed
         String indices = txtContador.getText();
        int indicei = Integer.parseInt(indices);
        if (indicei < alumnos_al.size()-1) {
            indicei++;
            txtContador.setText(indicei + "");
            pintarAlumno(indicei);
            
        }
    }//GEN-LAST:event_botDerechoActionPerformed

    private void botInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botInicioActionPerformed
        txtContador.setText("0");
        pintarAlumno(0);
                              
    }//GEN-LAST:event_botInicioActionPerformed

    private void botFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botFinActionPerformed
        txtContador.setText((alumnos_al.size()-1)+"");
        pintarAlumno(alumnos_al.size()-1);
                                        
    }//GEN-LAST:event_botFinActionPerformed

    public List<Alumno> obtenerListaNombres(String nombre) {
        List<Alumno> alumnosaux_al = new ArrayList<>();
        for (Alumno a : alumnos_al) {
            if (a.getNombre().toLowerCase().equals(nombre.toLowerCase())) { //ToLowerCase permite todo tipo de escritura en la busqueda, con mayuscula con minuscula o combinado.
                alumnosaux_al.add(a);
            }
        }

        return alumnosaux_al;
    }

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
            java.util.logging.Logger.getLogger(VentanaBuscarAlumno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaBuscarAlumno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaBuscarAlumno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaBuscarAlumno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaBuscarAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscarNombre;
    private javax.swing.JButton ButtonNuevo;
    private javax.swing.JButton botBuscar;
    private javax.swing.JButton botDerecho;
    private javax.swing.JButton botFin;
    private javax.swing.JButton botInicio;
    private javax.swing.JButton botIzquierdo;
    private javax.swing.JButton botNuevo;
    private javax.swing.JComboBox<String> cboMostrarNumeros;
    private javax.swing.JButton cmdBuscarId;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdNuevoEdad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JList<String> jlAsignaturas;
    private javax.swing.JPanel jpAlumnosxAsignatura;
    private javax.swing.JPanel jpCombobox;
    private javax.swing.JPanel jpID;
    private javax.swing.JPanel jpNombre;
    private javax.swing.JTabbedPane jtpPESTANIA;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblAsignatura;
    private javax.swing.JLabel lblAsignaturas;
    private javax.swing.JLabel lblBuscarNombre;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblID;
    private javax.swing.JTextField lblIdAlumno;
    private javax.swing.JTextField lblIdAlumno1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList lstAsignaturaID;
    private javax.swing.JList lstAsignaturaID1;
    private javax.swing.JList<String> lstAsignaturas;
    private javax.swing.JRadioButton rdMayor;
    private javax.swing.JRadioButton rdMenor;
    private javax.swing.JTextArea txaMostrarAlumnos;
    private javax.swing.JTextArea txaMostrarEdades;
    private javax.swing.JTextArea txaMostrarNombres;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellidoNavegar;
    private javax.swing.JTextField txtAsignatura;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextField txtContador;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEdad1;
    private javax.swing.JTextField txtEdadNavegar;
    private javax.swing.JTextField txtIdAlumno;
    private javax.swing.JTextField txtIdNavegar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombreNavegar;
    private javax.swing.JTextField txtTodo;
    private javax.swing.JTextField txtTodo1;
    // End of variables declaration//GEN-END:variables

}
