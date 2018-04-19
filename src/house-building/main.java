import com.sun.javafx.scene.control.skin.ComboBoxPopupControl.FakeFocusTextField;

import jdk.nashorn.internal.runtime.regexp.joni.ast.ConsAltNode;

class HB {
    public void buildLayer(int height) {
        if (height == 0)
            return;

        buildLayer(height - 1);

        System.out.println(height);
    }

    public void decode(String song) {
        String[] parts = song.split("WUB");
        String text = "";

        boolean isDouble = false;

        for (int i = 0; i < parts.length; i++) {
            if (isDouble && parts[i].equals("")) {
                isDouble = false;
                continue;
            }

            if (parts[i].equals("")) {
                isDouble = true;
            }

            if (text.length() == 0) {
                text += parts[i];
                continue;
            }

            System.out.println(isDouble);
            text += " " + parts[i];
        }

        System.out.println(text);
    }
}