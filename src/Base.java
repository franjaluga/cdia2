public class Base {

    private double remesa_bruta;
    private double incremento;
    private double remesa_incrementada;
    private double impuesto_adicional;
    private double credito_provisorio;
    private double restitucion;
    private double impuesto_adicional_por_pagar;
    private double remesa_bruta_final;
    private double impuesto_adicional_calculado;
    private double remesa_liquida;


    public Base calculateFromEmbrutecido(double embrutecido){

        Base base = new Base();

        base.remesa_bruta = Math.round(embrutecido);

        double rounded = Math.round(base.remesa_bruta * 0.369863);

        base.incremento = rounded;
        base.remesa_incrementada = Math.round(base.remesa_bruta + base.incremento);
        base.impuesto_adicional = Math.round(base.remesa_incrementada * 0.35);
        base.credito_provisorio = Math.round(base.incremento);
        base.restitucion = Math.round(base.credito_provisorio * 0.35);
        base.impuesto_adicional_por_pagar = Math.round(base.impuesto_adicional + base.restitucion - base.credito_provisorio );
        base.remesa_bruta_final = Math.round(base.remesa_bruta);
        base.impuesto_adicional_calculado = Math.round(base.impuesto_adicional_por_pagar);
        base.remesa_liquida = Math.round(base.remesa_bruta_final - base.impuesto_adicional_calculado);
        return base;
    }

    public Base calculateFromLiquido( double liquido ){
        Base base = new Base();

        boolean estado = true;
        base.remesa_bruta = 0;

        while( estado ){

            base.incremento =  Math.round(base.remesa_bruta * 0.369863);
            base.remesa_incrementada =  Math.round(base.remesa_bruta + base.incremento);
            base.impuesto_adicional =  Math.round(base.remesa_incrementada * 0.35);
            base.credito_provisorio =  Math.round(base.incremento);
            base.restitucion = Math.round(base.credito_provisorio * 0.35);
            base.impuesto_adicional_por_pagar = Math.round(base.impuesto_adicional + base.restitucion - base.credito_provisorio );
            base.remesa_bruta_final =  Math.round(base.remesa_bruta);
            base.impuesto_adicional_calculado =  Math.round(base.impuesto_adicional_por_pagar);
            base.remesa_liquida =  Math.round(base.remesa_bruta_final - base.impuesto_adicional_calculado);

            if( base.remesa_liquida < liquido){
                base.remesa_bruta = base.remesa_bruta + 1;
                continue;
            }else{
                estado = true;
                break;
            }
        }

        return base;
    }

    public Base obtenerObjetoBaseCalculado( String mode, int value ){

        Base b = new Base();
        switch (mode){
            case "Desde liquido":
                b = this.calculateFromLiquido(value);
                break;
            case "Desde Bruto":
                b = this.calculateFromEmbrutecido(value);
                break;
            default:
                break;
        }

        return b;
    }

    public double getRemesa_bruta() {
        return remesa_bruta;
    }

    public double getIncremento() {
        return incremento;
    }

    public double getRemesa_incrementada() {
        return remesa_incrementada;
    }

    public double getImpuesto_adicional() {
        return impuesto_adicional;
    }

    public double getCredito_provisorio() {
        return credito_provisorio;
    }

    public double getImpuesto_adicional_por_pagar() {
        return impuesto_adicional_por_pagar;
    }

    public double getRemesa_bruta_final() {
        return remesa_bruta_final;
    }

    public double getImpuesto_adicional_calculado() {
        return impuesto_adicional_calculado;
    }

    public double getRemesa_liquida() {
        return remesa_liquida;
    }

    public double getRestitucion() {
        return restitucion;
    }
}