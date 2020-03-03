package junit.metadata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.squashtest.ta.galaxia.squash.tf.galaxia.annotations.TFMetadata;

public class MetadataTestOK {

    @Test
	@TFMetadata( key = "linked-TC",value={"118b48fb-5e3a-47e8-acb4-047112de679a"})
    @TFMetadata( key = "first_KEY", value = {"first_VALUE"})
    public void keyValue(){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
	@TFMetadata( key = "linked-TC",value={"ac34702d-2e8b-4451-bf9b-2fb613a83daa"})
    @TFMetadata( key = "solo_KEY")
    public void keyOnly(){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
	@TFMetadata( key = "linked-TC",value={"57e5677a-f4cf-43c1-843b-15119468a1e4"})
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
	@TFMetadata( key = "linked-TC",value={"f0cc727b-2fa2-4f90-93d3-7aff727d0bdd"})
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
