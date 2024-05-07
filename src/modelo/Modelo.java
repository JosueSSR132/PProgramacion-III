package modelo;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Modelo {

    private String rutaArchivoJSON = "src/Archivos/JSONPrueba1.txt";
    private JSONObject jsonData;

    public Modelo() {
        cargarDatosJSON();
    }

    private void cargarDatosJSON() {
        try {
            String jsonContent = new String(Files.readAllBytes(Paths.get(rutaArchivoJSON)));
            jsonData = new JSONObject(jsonContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean verificarUsuarioYContraseña(String usuario, String contraseña) {
    	 if (jsonData == null) {
             return false;
         }
         JSONArray usuarios = jsonData.optJSONArray("Usuarios");
         if (usuarios == null) {
             return false;
         }

         for (int i = 0; i < usuarios.length(); i++) {
             JSONObject usuarioObj = usuarios.getJSONObject(i);
             String nombre = usuarioObj.optString("Usuario");
             String pass = usuarioObj.optString("Contraseña");
             
             if (nombre.equals(usuario) && pass.equals(contraseña)) {
                 return true;
             }
         }

         return false;
    }

    public void agregarUsuario(String usuario, String contraseña) {
    	JSONArray usuarios = jsonData.optJSONArray("Usuarios");
        if (usuarios == null) {
            usuarios = new JSONArray();
        }

        JSONObject nuevoUsuario = new JSONObject();
        nuevoUsuario.put("nombre", usuario);
        nuevoUsuario.put("contraseña", contraseña);

        usuarios.put(nuevoUsuario);
        jsonData.put("Usuarios", usuarios);
        guardarDatosJSON();
    }

    public void guardarDatosJSON() {
        try (FileWriter fileWriter = new FileWriter(rutaArchivoJSON)) {
            fileWriter.write(jsonData.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void agregarCompañía(String compañía) {
        JSONArray companias = jsonData.optJSONArray("Lista de Compañías");
        if (companias == null) {
            companias = new JSONArray();
        }
        companias.put(compañía);
        jsonData.put("Lista de Compañías", companias);
        guardarDatosJSON();
    }

    public JSONArray obtenerListaCompañías() {
        return jsonData.optJSONArray("Lista de Compañías");
    }
    
    public boolean existeUsuario(String usuario) {
        if (jsonData == null) {
            return false;
        }

        JSONArray usuarios = jsonData.optJSONArray("Usuarios");
        if (usuarios == null) {
            return false;
        }

        for (int i = 0; i < usuarios.length(); i++) {
            JSONObject usuarioObj = usuarios.getJSONObject(i);
            String nombre = usuarioObj.optString("Usuario");
            if (nombre.equals(usuario)) {
                return true;
            }
        }

        return false;
    }

    public boolean esContraseñaCorrecta(String usuario, String contraseña) {
        if (jsonData == null) {
            return false;
        }

        JSONArray usuarios = jsonData.optJSONArray("Usuarios");
        if (usuarios == null) {
            return false;
        }

        for (int i = 0; i < usuarios.length(); i++) {
            JSONObject usuarioObj = usuarios.getJSONObject(i);
            String nombre = usuarioObj.optString("Usuario");
            String pass = usuarioObj.optString("Contraseña");

            if (nombre.equals(usuario) && pass.equals(contraseña)) {
                return true;
            }
        }

        return false;
    }
}
