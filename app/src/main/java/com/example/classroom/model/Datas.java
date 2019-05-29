package com.example.classroom.model;

public class Datas {
    private String[] segundas;
    private String[] tercas;
    private String[] quartas;
    private String[] quintas;
    private String[] sextas;
    public Datas(){
        this.segundas = getSegundas();
        this.tercas = getTercas();
        getQuartas();
        getQuintas();
        getSextas();
    }

    public String[] getSegundas() {
        String[] segundas = new String[]{"04/02/2019","11/02/2019","18/02/2019", "25/02/2019",
                "04/03/2019","11/03/2019","18/03/2019", "25/03/2019","01/04/2019","08/04/2019",
                "15/04/2019", "22/04/2019","29/04/2019","06/05/2019","13/05/2019", "20/05/2019","27/05/2019",
                "03/06/2019","10/06/2019","17/06/2019","24/06/2019"};
        return segundas;
    }

    public void setSegundas(String[] segundas) {
        this.segundas = segundas;
    }

    public String[] getTercas() {
        String[] tercas = new String[]{"05/02/2019","12/02/2019","19/02/2019", "26/02/2019",
                "05/03/2019","12/03/2019","19/03/2019", "24/03/2019","02/04/2019","09/04/2019",
                "16/04/2019", "23/04/2019","30/04/2019","07/05/2019","14/05/2019", "21/05/2019","28/05/2019",
                "04/06/2019","11/06/2019","18/06/2019","25/06/2019"};
        return tercas;
    }

    public void setTercas(String[] tercas) {
        this.tercas = tercas;
    }

    public String[] getQuartas() {
        this.quartas = new String[]{"06/02/2019","13/02/2019","20/02/2019", "27/02/2019",
                "06/03/2019","13/03/2019","20/03/2019", "25/03/2019","03/04/2019","10/04/2019",
                "17/04/2019", "24/04/2019","1/05/2019","08/05/2019","15/05/2019", "22/05/2019","29/05/2019",
                "05/06/2019","12/06/2019","19/06/2019","26/06/2019"};
        return this.quartas;
    }

    public void setQuartas(String[] quartas) {
        this.quartas = quartas;
    }

    public String[] getQuintas() {
        this.quintas = new String[]{"07/02/2019","14/02/2019","21/02/2019", "28/02/2019",
                "07/03/2019","14/03/2019","21/03/2019", "26/03/2019","04/04/2019","11/04/2019",
                "18/04/2019", "25/04/2019","02/05/2019","09/05/2019","16/05/2019", "23/05/2019","30/05/2019",
                "06/06/2019","13/06/2019","20/06/2019","27/06/2019"};
        return this.quintas;
    }

    public void setQuintas(String[] quintas) {
        this.quintas = quintas;
    }

    public String[] getSextas() {
        this.sextas = new String[]{"08/02/2019","15/02/2019","22/02/2019", "01/03/2019",
                "08/03/2019","15/03/2019","22/03/2019", "27/03/2019","05/04/2019","12/04/2019",
                "19/04/2019", "26/04/2019","03/05/2019","10/05/2019","17/05/2019", "24/05/2019","01/06/2019",
                "07/06/2019","14/06/2019","21/06/2019","28/06/2019"};
        return this.sextas;
    }

    public void setSextas(String[] sextas) {
        this.sextas = sextas;
    }
}
