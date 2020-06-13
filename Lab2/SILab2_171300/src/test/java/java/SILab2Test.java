package java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private List<String> createList(String... elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void everyBranchTest(){
        RuntimeException ex;

        //user = null
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null,null));
        assertTrue(ex.getMessage().contains("The user argument is not initialized!"));

        //user = Eli,mojpass,boshevskaeli@gmail.com; allUsers:Eli,Nikola,Petar
        ex = assertThrows(RuntimeException.class, () -> SILab2.funcion("Eli,mojpass,boshevskaeli@gmail.com", createList("Eli,Nikola,Petar")));
        assertTrue(ex.getMessage().contains("User already exists!"));

        //user = Eli,mojpass,null; allUsers:Nikola,Petar,Ana
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null,null));
        




    }


}