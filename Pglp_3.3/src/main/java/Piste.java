
import fr.uvsq.pglp_3.Robot;
import fr.uvsq.pglp_3.RobotBouge;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andri
 */
public class Piste {
    
    private List<Robot> robotList;
    private List<RobotBouge> bougeList;
    
    public Piste() {
        robotList = new ArrayList<Robot>();
        bougeList = new ArrayList<RobotBouge>();
    }
    
    public void avancerTous() {
        for (RobotBouge robotBouge : bougeList){
            robotBouge.avance();
        }
    }
}
