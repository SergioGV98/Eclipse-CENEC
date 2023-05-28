package interfaces;

import javax.swing.*;

import clases.Capitulo;

import java.awt.*;

public class AnimeInformacion extends JPanel {
    private JScrollPane scrollPane;
    private JPanel contenedorElemento;
    private Ventana ventana;

    public AnimeInformacion(Ventana v) {
        this.ventana = v;

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridheight = 2;
        gbc.insets = new Insets(0, 0, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;

        scrollPane = new JScrollPane();
        contenedorElemento = new JPanel();
        contenedorElemento.setLayout(new BoxLayout(contenedorElemento, BoxLayout.Y_AXIS));
        scrollPane.setViewportView(contenedorElemento);

        add(scrollPane, gbc);

        // Agregar elementos a la lista
        for (int i = 0; i < 10; i++) {
            Capitulo capitulo = new Capitulo("Capítulo " + (i + 1), "Descripción del Capítulo " + (i + 1),
                    "./imagenes/capitulo" + (i + 1) + ".jpg");
            contenedorElemento.add(new ElementoLista(capitulo, v));
        }
    }
}

