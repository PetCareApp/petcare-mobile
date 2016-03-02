package cap7.com.br.petcare.dao;

import android.content.ContentValues;
import android.content.Context;

import java.text.SimpleDateFormat;
import java.util.Locale;

import cap7.com.br.petcare.model.Animal;
import cap7.com.br.petcare.model.ScriptDB;

/**
 * Created by Admin on 02/03/2016.
 */
public class AnimalDao extends DBDao {

    public AnimalDao(Context context) {
        super(context);
    }

    public long save(Animal animal) {
        ContentValues values = new ContentValues();
        values.put(ScriptDB.ANIMAL_CODIGO, animal.getCodigo());
        values.put(ScriptDB.ANIMAL_NOME, animal.getNome());
        values.put(ScriptDB.ANIMAL_NASCIMENTO, animal.getNascimento());
        values.put(ScriptDB.ANIMAL_ESPECIE, animal.getEspecie());
        values.put(ScriptDB.ANIMAL_SEXO, animal.getSexo());
        values.put(ScriptDB.ANIMAL_RACA, animal.getRaca());
        values.put(ScriptDB.ANIMAL_COR, animal.getCor());

        return database.insert(ScriptDB.TAB_ANIMAL, null, values);
    }
}