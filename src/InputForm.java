import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;


/**
 *
 * Hola colega programador,
 * Si haz llegado hasta aquí, bueno, no te culpo, Java se puede "descompilar" y no quise ofuscar este Código.
 * Te aprovecho de contar que este es un "Producto Mínimo viable" por lo que
 * apenas tiene prácticas de clean code. En siguientes iteraciones lo haré.
 *
 * Un saludo
 */

public class InputForm{

    JFrame jf = new JFrame();

    public InputForm(){
        this.jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.jf.setSize(650,800);
        this.jf.setResizable(false);

    }

    public void configure(){

        JPanel jp = new JPanel(new GridLayout(20,2,10,10));
        jp.setBorder(new EmptyBorder(20,50,20,50));
        jp.setSize(650,800);
        this.jf.add(jp);
        this.jf.setTitle("Calculadora de impuesto adicional remesas");

        //BLOQUE 0A
        JRadioButton jrBtL = new JRadioButton("Bruto -> Liquido");
        JRadioButton jrLtB = new JRadioButton("Liquido -> Bruto");

        jrBtL.setSelected(true);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jrBtL);
        buttonGroup.add(jrLtB);

        //BLOQUE 0B
        JRadioButton jrCConv = new JRadioButton("Con CDTI");
        JRadioButton jrSConv = new JRadioButton("Sin CDTI");

        jrCConv.setSelected(true);

        ButtonGroup buttonGroupCdti = new ButtonGroup();
        buttonGroupCdti.add(jrCConv);
        buttonGroupCdti.add(jrSConv);

        //BLOQUE 0C
        JRadioButton jrTasaA= new JRadioButton("14-A");
        JRadioButton jrTasaD3 = new JRadioButton("14-D3");

        jrTasaA.setSelected(true);

        ButtonGroup buttonGroupRegimen = new ButtonGroup();
        buttonGroupRegimen.add(jrTasaA);
        buttonGroupRegimen.add(jrTasaD3);

        //BLOQUE 1
        JLabel lbl_titulo1 = new JLabel("Detalle");
        JLabel lbl_empty1 = new JLabel("");
        JLabel lbl_remesa_bruta = new JLabel("Remesa Bruta");
        JTextArea txt_remesa_bruta = new JTextArea("0");
        JLabel lbl_incremento = new JLabel("Incremento -> 27/73 (2024)");
        JTextArea txt_incremento = new JTextArea("0");
        JLabel lbl_remesa_inrementada = new JLabel("Remesa Incrementada");
        JTextArea txt_remesa_inrementada = new JTextArea("0");
        JLabel lbl_impto_adicional = new JLabel("Ret. impuesto adicional según tasa");
        JTextArea txt_impto_adicional = new JTextArea("0");
        JLabel lbl_restitucion = new JLabel("Restitucion");
        JTextArea txt_restitucion = new JTextArea("0");
        JLabel lbl_cred_provisorio = new JLabel("Crédito provisorio");
        JTextArea txt_cred_provisorio = new JTextArea("0");
        JLabel lbl_impto_adic_determinado = new JLabel("Retención neta a pagar F50");
        JTextArea txt_impto_adic_determinado = new JTextArea("0");

        //BLOQUE 2
        JLabel lbl_titulo2 = new JLabel("Registro en el F50");
        JLabel lbl_empty2 = new JLabel("");
        JLabel lbl_cod_759 = new JLabel("Cod.759");
        JTextArea txt_cod_759 = new JTextArea("0");
        JLabel lbl_cod_760 = new JLabel("Cod.760");
        JTextArea txt_cod_760 = new JTextArea("0");
        JLabel lbl_cod_761 = new JLabel("Cod.761");
        JTextArea txt_cod_761 = new JTextArea("0");

        //BLOQUE 3
        JLabel lbl_titulo3 = new JLabel("Conciliación remesa");
        JLabel lbl_empty3 = new JLabel("");
        JLabel lbl_remesa_bruta_final = new JLabel("Remesa Bruta (procesada)");
        JTextArea txt_remesa_bruta_final = new JTextArea("0");
        JLabel lbl_impto_adicional_ret = new JLabel("Impto. Adic. retenido");
        JTextArea txt_impto_adicional_ret = new JTextArea("0");
        JLabel lbl_remesa_liquida = new JLabel("Remesa líquida a pago");
        JTextArea txt_remesa_liquida = new JTextArea("0");

        JLabel lbl_empty4 = new JLabel("");
        JButton limpiar = new JButton("Limpiar");
        JButton jb = new JButton("Calcular");

        // COMPORTAMIENTOS BASE A

        txt_remesa_bruta.setEditable(true);
        txt_incremento.setEditable(false);
        txt_remesa_inrementada.setEditable(false);
        txt_impto_adicional.setEditable(false);
        txt_restitucion.setEditable(false);
        txt_cred_provisorio.setEditable(false);
        txt_impto_adic_determinado.setEditable(false);

        txt_cod_759.setEditable(false);
        txt_cod_760.setEditable(false);
        txt_cod_761.setEditable(false);

        txt_remesa_bruta_final.setEditable(false);
        txt_impto_adicional_ret.setEditable(false);
        txt_remesa_liquida.setEditable(false);

        // COMPORTAMIENTOS BASE B

        txt_remesa_bruta.setFocusable(true);
        txt_incremento.setFocusable(false);
        txt_remesa_inrementada.setFocusable(false);
        txt_impto_adicional.setFocusable(false);
        txt_restitucion.setFocusable(false);
        txt_cred_provisorio.setFocusable(false);
        txt_impto_adic_determinado.setFocusable(false);

        txt_cod_759.setFocusable(false);
        txt_cod_760.setFocusable(false);
        txt_cod_761.setFocusable(false);

        txt_remesa_bruta_final.setFocusable(false);
        txt_impto_adicional_ret.setFocusable(false);
        txt_remesa_liquida.setFocusable(false);

        // COMPORTAMIENTOS BASE C

        txt_remesa_bruta.setBackground(Color.white);
        txt_incremento.setBackground(Color.lightGray);
        txt_remesa_inrementada.setBackground(Color.lightGray);
        txt_impto_adicional.setBackground(Color.lightGray);
        txt_restitucion.setBackground(Color.lightGray);
        txt_cred_provisorio.setBackground(Color.lightGray);
        txt_impto_adic_determinado.setBackground(Color.lightGray);

        txt_cod_759.setBackground(Color.lightGray);
        txt_cod_760.setBackground(Color.lightGray);
        txt_cod_761.setBackground(Color.lightGray);

        txt_remesa_bruta_final.setBackground(Color.lightGray);
        txt_impto_adicional_ret.setBackground(Color.lightGray);
        txt_remesa_liquida.setBackground(Color.lightGray);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txt_remesa_bruta.setBackground(Color.white);
                txt_remesa_liquida.setBackground(Color.white);

                boolean process1 = false;
                boolean process2 = false;

                if( isInRange(txt_remesa_bruta.getText()) ){
                    process1 = true;
                    txt_remesa_bruta.setBackground(Color.green);
                }else{
                    txt_remesa_bruta.setBackground(Color.red);
                }

                if( isInRange(txt_remesa_liquida.getText()) ){
                    process2 = true;
                    txt_remesa_liquida.setBackground(Color.green);
                }else{
                    txt_remesa_liquida.setBackground(Color.red);
                }

                if(process1 && process2){

                    Base base = new Base();

                    if( jrBtL.isSelected() ){
                        base = base.calculateFromEmbrutecido(Double.parseDouble(txt_remesa_bruta.getText()) , jrCConv.isSelected(), jrTasaA.isSelected() );
                    } else if ( jrLtB.isSelected() ) {
                        base = base.calculateFromLiquido(Double.parseDouble(txt_remesa_liquida.getText()) , jrCConv.isSelected(), jrTasaA.isSelected());
                    }

                    txt_remesa_bruta.setText( String.format("%.0f", base.getRemesa_bruta()) );
                    txt_incremento.setText(String.format("%.0f", base.getIncremento()));
                    txt_remesa_inrementada.setText(String.format("%.0f", base.getRemesa_incrementada()));
                    txt_impto_adicional.setText(String.format("%.0f", base.getImpuesto_adicional()));
                    txt_restitucion.setText(String.format("%.0f", base.getRestitucion()));
                    txt_cred_provisorio.setText(String.format("%.0f", base.getCredito_provisorio()));
                    txt_impto_adic_determinado.setText(String.format("%.0f", base.getImpuesto_adicional_calculado()));

                    txt_cod_759.setText(String.format("%.0f", base.getRemesa_incrementada()));
                    txt_cod_760.setText(String.format("%.0f", base.getCredito_provisorio()));
                    txt_cod_761.setText(String.format("%.0f", base.getImpuesto_adicional_por_pagar()));

                    txt_remesa_bruta_final.setText(String.format("%.0f", base.getRemesa_bruta_final()));
                    txt_impto_adicional_ret.setText(String.format("%.0f", base.getImpuesto_adicional_calculado()));
                    txt_remesa_liquida.setText(String.format("%.0f", base.getRemesa_liquida()));

                }
            }
        });

        jrBtL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_remesa_bruta.setBackground(Color.white);
                txt_remesa_bruta.setEditable(true);
                txt_remesa_bruta.setFocusable(true);

                txt_remesa_liquida.setBackground(Color.lightGray);
                txt_remesa_liquida.setEditable(false);
                txt_remesa_liquida.setFocusable(false);
            }
        });

        jrLtB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_remesa_bruta.setBackground(Color.lightGray);
                txt_remesa_bruta.setEditable(false);
                txt_remesa_bruta.setFocusable(false);


                txt_remesa_liquida.setBackground(Color.white);
                txt_remesa_liquida.setEditable(true);
                txt_remesa_liquida.setFocusable(true);

            }
        });

        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_remesa_bruta.setText("0");
                txt_incremento.setText("0");
                txt_remesa_inrementada.setText("0");
                txt_impto_adicional.setText("0");
                txt_restitucion.setText("0");
                txt_cred_provisorio.setText("0");
                txt_impto_adic_determinado.setText("0");

                txt_cod_759.setText("0");
                txt_cod_760.setText("0");
                txt_cod_761.setText("0");

                txt_remesa_bruta_final.setText("0");
                txt_impto_adicional_ret.setText("0");
                txt_remesa_liquida.setText("0");
            }
        });

        jrTasaA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_incremento.setText("Incremento -> 27/73 (2024)");
            }
        });

        jrTasaD3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_incremento.setText("Incremento -> 12.5/87.5 (2024)");
            }
        });

        JPanel fp1 = new JPanel( new GridLayout(2,1));
        JPanel fp2 = new JPanel( new GridLayout(2,1));
        JPanel fp3 = new JPanel( new GridLayout(2,1));

        JPanel jSup = new JPanel(new GridLayout(1,3));
        jSup.add(fp3);
        jSup.add(fp2);

        jp.add(jSup);
        jp.add(fp1);

        fp1.add(jrBtL);
        fp1.add(jrLtB);

        fp2.add(jrCConv);
        fp2.add(jrSConv);

        fp3.add(jrTasaA);
        fp3.add(jrTasaD3);

        jp.add(lbl_titulo1);
        jp.add(lbl_empty1);
        jp.add(lbl_remesa_bruta);
        jp.add(txt_remesa_bruta);
        jp.add(lbl_incremento);
        jp.add(txt_incremento);
        jp.add(lbl_remesa_inrementada);
        jp.add(txt_remesa_inrementada);
        jp.add(lbl_impto_adicional);
        jp.add(txt_impto_adicional);
        jp.add(lbl_restitucion);
        jp.add(txt_restitucion);
        jp.add(lbl_cred_provisorio);
        jp.add(txt_cred_provisorio);
        jp.add(lbl_impto_adic_determinado);
        jp.add(txt_impto_adic_determinado);

        jp.add(lbl_titulo2);
        jp.add(lbl_empty2);
        jp.add(lbl_cod_759);
        jp.add(txt_cod_759);
        jp.add(lbl_cod_760);
        jp.add(txt_cod_760);
        jp.add(lbl_cod_761);
        jp.add(txt_cod_761);

        jp.add(lbl_titulo3);
        jp.add(lbl_empty3);
        jp.add(lbl_remesa_bruta_final);
        jp.add(txt_remesa_bruta_final);
        jp.add(lbl_impto_adicional_ret);
        jp.add(txt_impto_adicional_ret);
        jp.add(lbl_remesa_liquida);
        jp.add(txt_remesa_liquida);

        jp.add(limpiar);
        jp.add(jb);

        jp.add(new JLabel(""));

        JPanel jpi = new JPanel(new GridLayout(2,1));
        jp.add(jpi);

        JLabel firma1 = new JLabel("Adquiere un versión modificada o actualización");
        JLabel firma2 = new JLabel("al correo auditor.lucero@gmail.com");
        jpi.add(firma1);
        jpi.add(firma2);

        firma1.setForeground(Color.blue);
        firma2.setForeground(Color.blue);
        jp.add(jpi);

        Font fontTitle = new Font("Arial", Font.BOLD, 20);

        lbl_titulo1.setFont(fontTitle);
        lbl_titulo2.setFont(fontTitle);
        lbl_titulo3.setFont(fontTitle);

        this.jf.setVisible(true);
    }


    public static boolean isInRange(String str) {
        Pattern pattern = Pattern.compile("^([1-9]\\d{0,8}|0)$");
        return pattern.matcher(str).matches();
    }

}
