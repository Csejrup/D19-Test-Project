package GUI.Controller;
import DataBase.DB;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * FXML CONTROLLER CLASS
 * FOR StatisticGUI.fxml
 * DOES NOT WORK
 *
 * Handles Statistics Actions
 */

public class FXMLStatisticController extends AbstractController {

    /*----------------------------------------All FXML Button, Field,Label Declaration-----------------------*/

    @FXML private Button btnMainMenu;
    @FXML private LineChart<Number, Number> lineChart;
    @FXML private CategoryAxis dateSold;
    @FXML private NumberAxis totalPrice;

    /*----------------------------------------All FXML Button, Field,Label Declaration-----------------------*/

    XYChart.Series<Number,Number> series1 = new XYChart.Series<>();
    XYChart.Series<Number,Number> series2 = new XYChart.Series<>();
    private void showTrendCurve(){
        NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis();
    }
    private void chartSeriesData(){
        ArrayList<Integer> xs = new ArrayList<>();
        ArrayList<Integer> ys = new ArrayList<>();
       // DB.selectSQL("SELECT fldTotal_QTY_Sold FROM tblSales");
       // DB.selectSQL("SELECT fldProductPrice FROM tblSales");
        getDataFromDB(xs,ys);
    }
    private void getDataFromDB(ArrayList<Integer> xs, ArrayList<Integer> ys){
        try{
            do {
                String data = DB.getData();
                if (data.equals(DB.NOMOREDATA)) {
                    break;
                } else {
                    // ADDS EACH ELEMENT TO THE ARRAY LIST
                    xs.add(Integer.parseInt(data));
                    ys.add(Integer.parseInt(data));
                    System.out.print(data);
                }
            } while (true);

            for (Integer i: xs) {
                series1.getData().add(new XYChart.Data<>(xs.get(i), 0));
                series2.getData().add(new XYChart.Data<>(0,ys.get(i)));
            }
            System.out.println(series1);
            System.out.println(series2);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @FXML
    void showMainMenu(ActionEvent event) {
        System.out.println("HEJ");
        Stage stage = (Stage) btnMainMenu.getScene().getWindow();
        loadscreen(stage, "MainGUI.fxml");
    }
}



