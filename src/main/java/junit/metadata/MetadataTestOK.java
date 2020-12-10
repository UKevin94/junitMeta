package junit.metadata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.squashtest.ta.galaxia.squash.tf.galaxia.annotations.TFMetadata;

public class MetadataTestOK {

    @Test
    @TFMetadata( key = "linked-TC",value={"c4905a19-58f1-4b75-a497-b935114e647e"})
    @TFMetadata( key = "first_KEY", value = {"first_VALUE"})
    public void keyValue(){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
    @TFMetadata( key = "linked-TC",value={"c813fd3e-89e4-4dba-9f92-ab73769a57af"})
    @TFMetadata( key = "solo_KEY")
    public void keyOnly(){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
	@TFMetadata( key = "linked-TC",value={"a6c78599-cffa-4a38-adb3-26e74b74a417"})
    @TFMetadata( key = "multi_KEY", value = {"first_LIST", "second_LIST", "third_LIST"})
    public void keyMultilineValue(){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
    @TFMetadata( key = "multi_KEY_duplicate", value = {"first_LIST", "second_LIST", "first_LIST"})
    public void keyMultilineValueDuplicatedWarning(){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
	@TFMetadata( key = "linked-TC",value={"4cf04703-9056-4166-9665-a1b1694415cc"})
    @TFMetadata( key = "first_KEY_annots", value = {"first_VALUE"})
    @TFMetadata( key = "solo")
    @TFMetadata( key = "list", value = {"first_item", "second_item", "third_item"})
    public void multiAnnot(){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
    @TFMetadata( key = "1111", value = {"22222"})
    @TFMetadata( key = "3333")
    @TFMetadata( key = "5555", value = {"6666", "7777", "8888"})
    public void numbersEverywhere(){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
    @TFMetadata( key = "first_K-E.Y", value = {"first_VALUE"})
    @TFMetadata( key = "se.con-d_KEY")
    @TFMetadata( key = "mu.l-ti_Key", value = {"one", "two", "three"})
    @TFMetadata( key = "first", value = {"fi/r-s.t_VALUE"})
    @TFMetadata( key = "second", value = {"o/ne", "t.wo", "t-hr_ee"})
    public void specialChar(){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

}
