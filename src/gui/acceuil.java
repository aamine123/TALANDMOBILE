package gui;

import com.codename1.components.ImageViewer;
import com.codename1.ui.*;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.Resources;
import entities.Sujet;
import services.ServiceSujet;

import java.util.ArrayList;

public class acceuil extends Form {
    private Resources theme;
    private ServiceSujet ser;
    private ArrayList<Sujet> Sujets;
    private Container listsujetscont;



    public acceuil(Resources theme){
        setTitle("Taland");
        this.getToolbar().addCommandToLeftSideMenu("Home", null, (evt) -> {
        });
        this.getToolbar().addCommandToLeftSideMenu("Forum", null, (evt) -> {
        });
        this.getToolbar().addCommandToLeftSideMenu("Tv Show", null, (evt) -> {
        });
        this.getToolbar().addCommandToLeftSideMenu("Competition", null, (evt) -> {
        });
        this.getToolbar().addCommandToLeftSideMenu("event", null, (evt) -> {
        });

        this.setLayout(BoxLayout.y());
        this.theme=theme;

        /********afficher les sujets**********/
        ser = new ServiceSujet();
        Sujets = new ArrayList<>();
        Sujets = ser.getAllTasks();
        listsujetscont = new Container();
        for (int i = 0; i < Sujets.size(); i++) {
            listsujetscont.add(addItem(ser.getAllTasks().get(i)));
        }
        add(listsujetscont);
        /********end afficher les sujets**********/


    }
    public Container addItem(Sujet vid) {
        Container holder = new Container(BoxLayout.x());
        Container ctDetails = new Container(BoxLayout.y());
        Label titre = new Label("Description : "+ vid.getDescription_f());
        Label a = new Label("Sujet : "+ vid.getNbre_jaime());
        titre.addPointerReleasedListener(new ActionListener() {
                                             @Override
                                             public void actionPerformed(ActionEvent evt) {


                                             }
                                         });
                //  ArrayList<Categorie> li= new ArrayList<>();
                ctDetails.addAll(titre,a);
               /* li.addAll(vid.getCategories());
                for(int i=0;i<li.size();i++)
                {
                    ctDetails.add(new Label("categorie: "+li.get(i).getNom()));
                }
*/
        EncodedImage enc = EncodedImage.createFromImage(theme.getImage("t.jpg"), false);
        Image image = URLImage.createToStorage(enc, vid.getCoverimage(), "http://localhost/TalandWEB/web/images" + vid.getCoverimage());
        ImageViewer img = new ImageViewer(image);
       holder.add(img);
        holder.add(ctDetails);
        // img.addPointerReleasedListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent evt) {
        
        //      }
        //   });


        holder.setLeadComponent(titre);
        return holder;
    }

}
