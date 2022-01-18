package sudokugames;



import javax.swing.*;

import java.awt.*;

public class GameFive extends JPanel {
    Main vista;
    GameController gameController;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40,b41,b42,b43,b44,b45,b46,b47,b48,b49,b50,b51,b52,b53,b54,b55,b56,b57,b58,b59,b60,b61,b62,b63,b64,b65,b66,b67,b68,b69,b70,b71,b72,b73,b74,b75,b76,b77,b78,b79,b80,b81,finish;
    JButton back;

    public GameFive(Main vista) {
        this.setLayout(new BorderLayout());
        this.vista = vista;
        gameController = new GameController(vista);
        this.add(createPanel());
    }

    private Component createPanel() {
     //bir c haric hepsi gizli once a yi bul sonra c yi 
        JPanel panel = new JPanel();
        b1=new JButton("6");
        b2=new JButton("8");
        b3=new JButton("3");
        b4=new JButton("b");
        b5=new JButton("9");
        b6=new JButton("a");
        b7=new JButton("2");
        b8=new JButton("5");
        b9=new JButton("c");

        b10=new JButton("9");
        b11=new JButton("a");
        b12=new JButton("5");
        b13=new JButton("2");
        b14=new JButton("c");
        b15=new JButton("3");
        b16=new JButton("6");
        b17=new JButton("8");
        b18=new JButton("b");

        b19=new JButton("c");
        b20=new JButton("2");
        b21=new JButton("b");
        b22=new JButton("8");
        b23=new JButton("6");
        b24=new JButton("5");
        b25=new JButton("9");
        b26=new JButton("a");
        b27=new JButton("3");

        b28=new JButton("8");
        b29=new JButton("7");
        b30=new JButton("a");
        b31=new JButton("6");
        b32=new JButton("2");
        b33=new JButton("9");
        b34=new JButton("3");
        b35=new JButton("c");
        b36=new JButton("5");



        b37=new JButton("3");
        b38=new JButton("c");
        b39=new JButton("9");
        b40=new JButton("1");
        b41=new JButton("5");
        b42=new JButton("8");
        b43=new JButton("b");
        b44=new JButton("2");
        b45=new JButton("6");

        b46=new JButton("2");
        b47=new JButton("5");
        b48=new JButton("6");
        b49=new JButton("3");
        b50=new JButton("7");
        b51=new JButton("c");
        b52=new JButton("8");
        b53=new JButton("9");
        b54=new JButton("a");

        b55=new JButton("a");
        b56=new JButton("3");
        b57=new JButton("2");
        b58=new JButton("5");
        b59=new JButton("8");
        b60=new JButton("6");
        b61=new JButton("4");
        b62=new JButton("7");
        b63=new JButton("9");

        b64=new JButton("5");
        b65=new JButton("9");
        b66=new JButton("8");
        b67=new JButton("c");
        b68=new JButton("3");
        b69=new JButton("7");
        b70=new JButton("a");
        b71=new JButton("6");
        b72=new JButton("2");

        b73=new JButton("b");
        b74=new JButton("6");
        b75=new JButton("c");
        b76=new JButton("9");
        b77=new JButton("a");
        b78=new JButton("2");
        b79=new JButton("5");
        b80=new JButton("3");
        b81=new JButton("8");

        finish=new JButton("finish");
        back = new JButton("back");

        b1.setBounds(10,30,50,40);
        b10.setBounds(10,80,50,40);
        b19.setBounds(10,130,50,40);
        b28.setBounds(10,180,50,40);
        b37.setBounds(10,230,50,40);
        b46.setBounds(10,280,50,40);
        b55.setBounds(10,330,50,40);
        b64.setBounds(10,380,50,40);
        b73.setBounds(10,430,50,40);

        b2.setBounds(70,30,50,40);
        b11.setBounds(70,80,50,40);
        b20.setBounds(70,130,50,40);
        b29.setBounds(70,180,50,40);
        b38.setBounds(70,230,50,40);
        b47.setBounds(70,280,50,40);
        b56.setBounds(70,330,50,40);
        b65.setBounds(70,380,50,40);
        b74.setBounds(70,430,50,40);

        b3.setBounds(130,30,50,40);
        b12.setBounds(130,80,50,40);
        b21.setBounds(130,130,50,40);
        b30.setBounds(130,180,50,40);
        b39.setBounds(130,230,50,40);
        b48.setBounds(130,280,50,40);
        b57.setBounds(130,330,50,40);
        b66.setBounds(130,380,50,40);
        b75.setBounds(130,430,50,40);

        b4.setBounds(190,30,50,40);
        b13.setBounds(190,80,50,40);
        b22.setBounds(190,130,50,40);
        b31.setBounds(190,180,50,40);
        b40.setBounds(190,230,50,40);
        b49.setBounds(190,280,50,40);
        b58.setBounds(190,330,50,40);
        b67.setBounds(190,380,50,40);
        b76.setBounds(190,430,50,40);




        b5.setBounds(250,30,50,40);
        b14.setBounds(250,80,50,40);
        b23.setBounds(250,130,50,40);
        b32.setBounds(250,180,50,40);
        b41.setBounds(250,230,50,40);
        b50.setBounds(250,280,50,40);
        b59.setBounds(250,330,50,40);
        b68.setBounds(250,380,50,40);
        b77.setBounds(250,430,50,40);


        b6.setBounds(310,30,50,40);
        b15.setBounds(310,80,50,40);
        b24.setBounds(310,130,50,40);
        b33.setBounds(310,180,50,40);
        b42.setBounds(310,230,50,40);
        b51.setBounds(310,280,50,40);
        b60.setBounds(310,330,50,40);
        b69.setBounds(310,380,50,40);
        b78.setBounds(310,430,50,40);



        b7.setBounds(370,30,50,40);
        b16.setBounds(370,80,50,40);
        b25.setBounds(370,130,50,40);
        b34.setBounds(370,180,50,40);
        b43.setBounds(370,230,50,40);
        b52.setBounds(370,280,50,40);
        b61.setBounds(370,330,50,40);
        b70.setBounds(370,380,50,40);
        b79.setBounds(370,430,50,40);

        b8.setBounds(430,30,50,40);
        b17.setBounds(430,80,50,40);
        b26.setBounds(430,130,50,40);
        b35.setBounds(430,180,50,40);
        b44.setBounds(430,230,50,40);
        b53.setBounds(430,280,50,40);
        b62.setBounds(430,330,50,40);
        b71.setBounds(430,380,50,40);
        b80.setBounds(430,430,50,40);



        b9.setBounds(490,30,50,40);
        b18.setBounds(490,80,50,40);
        b27.setBounds(490,130,50,40);
        b36.setBounds(490,180,50,40);
        b45.setBounds(490,230,50,40);
        b54.setBounds(490,280,50,40);
        b63.setBounds(490,330,50,40);
        b72.setBounds(490,380,50,40);
        b81.setBounds(490,430,50,40);

        finish.setBounds(70,500, 100, 40);
        back.setBounds(250,500, 100, 40);
        back.setIcon(new ImageIcon("image/back-arrow.png"));

        add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);
        add(b10);add(b11);add(b12);add(b13);add(b14);add(b15);add(b16);add(b17);add(b18);
        add(b19);add(b20);add(b21);add(b22);add(b23);add(b24);add(b25);add(b26);add(b27);
        add(b28);add(b29);add(b30);add(b31);add(b32);add(b33);add(b34);add(b35);add(b36);
        add(b37);add(b38);add(b39);add(b40);add(b41);add(b42);add(b43);add(b44);add(b45);
        add(b46);add(b47);add(b48);add(b49);add(b50);add(b51);add(b52);add(b53);add(b54);
        add(b55);add(b56);add(b57);add(b58);add(b59);add(b60);add(b61);add(b62);add(b63);
        add(b64);add(b65);add(b66);add(b67);add(b68);add(b69);add(b70);add(b71);add(b72);
        add(b73);add(b74);add(b75);add(b76);add(b77);add(b78);add(b79);add(b80);add(b81); add(finish);
        add(back);

        b1.addActionListener(gameController);
        b1.setBackground(Color.ORANGE);
        b2.addActionListener(gameController);
        b2.setBackground(Color.ORANGE);
        b3.addActionListener(gameController);
        b3.setBackground(Color.ORANGE);
        b4.addActionListener(gameController);
        b4.setBackground(Color.YELLOW);
        b5.addActionListener(gameController);
        b5.setBackground(Color.YELLOW);
        b6.addActionListener(gameController);
        b6.setBackground(Color.YELLOW);
        b7.addActionListener(gameController);
        b7.setBackground(Color.ORANGE);
        b8.addActionListener(gameController);
        b8.setBackground(Color.ORANGE);
        b9.addActionListener(gameController);
        b9.setBackground(Color.ORANGE);

        b10.addActionListener(gameController);
        b10.setBackground(Color.ORANGE);
        b11.addActionListener(gameController);
        b11.setBackground(Color.ORANGE);
        b12.addActionListener(gameController);
        b12.setBackground(Color.ORANGE);
        b13.addActionListener(gameController);
        b13.setBackground(Color.YELLOW);
        b14.addActionListener(gameController);
        b14.setBackground(Color.YELLOW);
        b15.addActionListener(gameController);
        b15.setBackground(Color.YELLOW);
        b16.addActionListener(gameController);
        b16.setBackground(Color.ORANGE);
        b17.addActionListener(gameController);
        b17.setBackground(Color.ORANGE);
        b18.addActionListener(gameController);
        b18.setBackground(Color.ORANGE);

        b19.addActionListener(gameController);
        b19.setBackground(Color.ORANGE);
        b20.addActionListener(gameController);
        b20.setBackground(Color.ORANGE);
        b21.addActionListener(gameController);
        b21.setBackground(Color.ORANGE);
        b22.addActionListener(gameController);
        b22.setBackground(Color.YELLOW);
        b23.addActionListener(gameController);
        b23.setBackground(Color.YELLOW);
        b24.addActionListener(gameController);
        b24.setBackground(Color.YELLOW);
        b25.addActionListener(gameController);
        b25.setBackground(Color.ORANGE);
        b26.addActionListener(gameController);
        b26.setBackground(Color.ORANGE);
        b27.addActionListener(gameController);
        b27.setBackground(Color.ORANGE);

        b28.addActionListener(gameController);
        b28.setBackground(Color.YELLOW);
        b29.addActionListener(gameController);
        b29.setBackground(Color.YELLOW);
        b30.addActionListener(gameController);
        b30.setBackground(Color.YELLOW);
        b31.addActionListener(gameController);
        b31.setBackground(Color.ORANGE);
        b32.addActionListener(gameController);
        b32.setBackground(Color.ORANGE);
        b33.addActionListener(gameController);
        b33.setBackground(Color.ORANGE);
        b34.addActionListener(gameController);
        b34.setBackground(Color.YELLOW);
        b35.addActionListener(gameController);
        b35.setBackground(Color.YELLOW);
        b36.addActionListener(gameController);
        b36.setBackground(Color.YELLOW);


        b37.addActionListener(gameController);
        b37.setBackground(Color.YELLOW);
        b38.addActionListener(gameController);
        b38.setBackground(Color.YELLOW);
        b39.addActionListener(gameController);
        b39.setBackground(Color.YELLOW);
        b40.addActionListener(gameController);
        b40.setBackground(Color.ORANGE);
        b41.addActionListener(gameController);
        b41.setBackground(Color.ORANGE);
        b42.addActionListener(gameController);
        b42.setBackground(Color.ORANGE);
        b43.addActionListener(gameController);
        b43.setBackground(Color.YELLOW);
        b44.addActionListener(gameController);
        b44.setBackground(Color.YELLOW);
        b45.addActionListener(gameController);
        b45.setBackground(Color.YELLOW);


        b46.addActionListener(gameController);
        b46.setBackground(Color.YELLOW);
        b47.addActionListener(gameController);
        b47.setBackground(Color.YELLOW);
        b48.addActionListener(gameController);
        b48.setBackground(Color.YELLOW);
        b49.addActionListener(gameController);
        b49.setBackground(Color.ORANGE);
        b50.addActionListener(gameController);
        b50.setBackground(Color.ORANGE);
        b51.addActionListener(gameController);
        b51.setBackground(Color.ORANGE);
        b52.addActionListener(gameController);
        b52.setBackground(Color.YELLOW);
        b53.addActionListener(gameController);
        b53.setBackground(Color.YELLOW);
        b54.addActionListener(gameController);
        b54.setBackground(Color.YELLOW);
        b55.addActionListener(gameController);
        b55.setBackground(Color.ORANGE);
        b56.addActionListener(gameController);
        b56.setBackground(Color.ORANGE);
        b57.addActionListener(gameController);
        b57.setBackground(Color.ORANGE);
        b58.addActionListener(gameController);
        b58.setBackground(Color.YELLOW);
        b59.addActionListener(gameController);
        b59.setBackground(Color.YELLOW);
        b60.addActionListener(gameController);
        b60.setBackground(Color.YELLOW);
        b61.addActionListener(gameController);
        b61.setBackground(Color.ORANGE);
        b62.addActionListener(gameController);
        b62.setBackground(Color.ORANGE);
        b63.addActionListener(gameController);
        b63.setBackground(Color.ORANGE);
        b64.addActionListener(gameController);
        b64.setBackground(Color.ORANGE);
        b65.addActionListener(gameController);
        b65.setBackground(Color.ORANGE);
        b66.addActionListener(gameController);
        b66.setBackground(Color.ORANGE);
        b67.addActionListener(gameController);
        b67.setBackground(Color.YELLOW);
        b68.addActionListener(gameController);
        b68.setBackground(Color.YELLOW);
        b69.addActionListener(gameController);
        b69.setBackground(Color.YELLOW);
        b70.addActionListener(gameController);
        b70.setBackground(Color.ORANGE);
        b71.addActionListener(gameController);
        b71.setBackground(Color.ORANGE);
        b72.addActionListener(gameController);
        b72.setBackground(Color.ORANGE);
        b73.addActionListener(gameController);
        b73.setBackground(Color.ORANGE);
        b74.addActionListener(gameController);
        b74.setBackground(Color.ORANGE);
        b75.addActionListener(gameController);
        b75.setBackground(Color.ORANGE);
        b76.addActionListener(gameController);
        b76.setBackground(Color.YELLOW);
        b77.addActionListener(gameController);
        b77.setBackground(Color.YELLOW);
        b78.addActionListener(gameController);
        b78.setBackground(Color.YELLOW);
        b79.addActionListener(gameController);
        b79.setBackground(Color.ORANGE);
        b80.addActionListener(gameController);
        b80.setBackground(Color.ORANGE);
        b81.addActionListener(gameController);
        b81.setBackground(Color.ORANGE);

        finish.addActionListener(gameController);
        finish.setBackground(Color.black);
        finish.setForeground(Color.green);

        back.setActionCommand("back");
        back.addActionListener(gameController);

        return panel;
    }
}


