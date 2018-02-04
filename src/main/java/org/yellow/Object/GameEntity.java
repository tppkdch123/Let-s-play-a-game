package org.yellow.Object;

import com.jogamp.opengl.GL4ES3;
import lombok.Data;
import org.yellow.Object.interfaces.Drawable;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

@Data
public class GameEntity implements Drawable {
    public FloatBuffer vertexes;
    public FloatBuffer normals;
    public FloatBuffer texCoords;
    private IntBuffer VAO;
    private IntBuffer VBO;

    public void init(GL4ES3 gl) {

    }

    public void drawSelf(GL4ES3 gl) {

    }

    public void drawDepth(GL4ES3 gl) {

    }
}
