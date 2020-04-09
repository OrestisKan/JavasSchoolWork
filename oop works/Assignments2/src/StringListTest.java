import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicBoolean;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SuppressWarnings({"RedundantStringConstructorCall", "SimplifiableJUnitAssertion"})
class StringListTest {

    @Test
    void initializes_amount() {
        assertThat("Amount should initially be zero", new StringList(1).getSize(), equalTo(0));
    }

    @Test
    void empty_list() {
        assertThrows(IllegalArgumentException.class, () -> {
            new StringList(0).add("New String");
        });
    }

    @Test
    void illegal_dimension_sets_empty_list() {
        assertThrows(IllegalArgumentException.class, () -> {
            new StringList(-5).add("New String");
        });
    }

    @Test
    void full_list() {
        StringList list = new StringList(2);
        list.add("String 1");
        list.add("String 2");
        assertThrows(IllegalArgumentException.class, () -> {
            list.add("String 3");
        });

    }

    @Test
    void add_and_get() {
        StringList list = new StringList(2);
        list.add("String 1");
        assertThat("The first item should be String 1", list.get(0), equalTo("String 1"));
    }

    @Test
    void add_and_get_multiple_values() {
        StringList list = new StringList(3);
        list.add("String 1");
        list.add("String 2");
        assertThat("The second item should be String 2", list.get(1), equalTo("String 2"));
    }

    @Test
    void negative_get() {
        assertThat("Invalid get should return null", new StringList(2).get(-5), equalTo(null));
    }

    @Test
    void outside_range_get() {
        assertThat("Outside range get should return null", new StringList(2).get(5), equalTo(null));
    }

    @Test
    void add_set_and_get() {
        StringList list = new StringList(3);
        list.add("String 1");
        list.set(0, "String 2");
        assertThat("The first item should be String 2", list.get(0), equalTo("String 2"));
    }

    @Test
    void negative_set() {
        assertThrows(IllegalArgumentException.class, () -> {
            new StringList(5).set(-2, "String -2");
        });
    }

    @Test
    void outside_range_set() {
        assertThrows(IllegalArgumentException.class, () -> {
            new StringList(5).set(6, "String 6");
        });
    }

    @Test
    void not_less_than_equal_amount_set() {
        assertThrows(IllegalArgumentException.class, () -> {
            new StringList(3).set(2, "String 2");
        });
    }

    @Test
    void index() {
        StringList list = new StringList(3);
        list.add("String 1");
        assertThat("The first item should be String 2", list.index(new String("String 1")), equalTo(0));
    }

    @Test
    void index_duplicate_values() {
        StringList list = new StringList(3);
        list.add("String 1");
        list.add("String 1");
        assertThat("The first item should be String 2", list.index(new String("String 1")), equalTo(0));
    }

    @Test
    void index_non_existing() {
        assertThat("Empty list can not have any items", new StringList(2).index(new String("String 1")), equalTo(-1));
    }

    @Test
    void contains() {
        StringList list = new StringList(3);
        list.add("String 1");
        assertThat("The first item should be String 2", list.contains(new String("String 1")), equalTo(true));
    }

    @Test
    void contains_duplicate_values() {
        StringList list = new StringList(3);
        list.add("String 1");
        list.add("String 1");
        assertThat("The first item should be String 2", list.contains(new String("String 1")), equalTo(true));
    }

    @Test
    void contains_non_existing() {
        assertThat("Empty list can not have any items", new StringList(2).contains(new String("String 1")), equalTo(false));
    }

    @SuppressWarnings("EqualsWithItself")
    @Test
    void equals_same_list_succesful() {
        StringList list = new StringList(0);
        assertTrue("An object should be equal to itself", list.equals(list));
    }

    @Test
    void equals_other_list_amount_failure() {
        StringList one = new StringList(0);
        StringList other = new StringList(1);
        assertFalse("Different lists with different amount should not be equal", one.equals(other));
    }

    @Test
    void equals_other_list_succesful() {
        StringList one = new StringList(1);
        StringList other = new StringList(1);
        one.add(new String("String 1"));
        other.add(new String("String 1"));
        assertTrue("Different lists with same elements should be equal", one.equals(other));
    }

    @Test
    void equals_with_different_length_same_amount() {
        StringList one = new StringList(2);
        StringList other = new StringList(3);
        one.add(new String("String 1"));
        one.add(null);
        other.add(new String("String 1"));
        other.add(null);
        assertFalse("Different lists of different length should not be equal", one.equals(other));
    }

    @Test
    void equals_other_list_elements_failure() {
        StringList one = new StringList(1);
        StringList other = new StringList(1);
        one.add(new String("String 1"));
        other.add(new String("String 2"));
        assertFalse("Different list with different elements should not be equal", one.equals(other));
    }

    @SuppressWarnings({"ConstantConditions", "ObjectEqualsNull", "SimplifiableJUnitAssertion"})
    @Test
    void equals_null_failure() {
        assertFalse("Null should not be equal to an object", new StringList(1).equals(null));
    }

    @Test
    void equals_with_null_value() {
        StringList one = new StringList(3);
        StringList other = new StringList(3);
        one.add(null);
        one.add("a");
        other.add(null);
        other.add("a");
        assertTrue("StringLists should work with null values", one.equals(other));
    }

    @Test
    void equals_amount() {
        StringList one = new StringList(3);
        StringList other = new StringList(3);
        one.add("a");
        other.add("a");
        other.add(null);
        assertFalse("StringLists with a null value added should be different", one.equals(other));
    }

    @Test
    void equals_amount_not_same() {
        StringList one = new StringList(3);
        StringList other = new StringList(3);
        one.add(null);
        assertFalse("StringLists with a different amount of items should not be the same", one.equals(other));
    }

    @Test
    void equals_does_not_use_tostring() {
        final AtomicBoolean called = new AtomicBoolean(false);

        class StringListMock extends StringList {

            private StringListMock(int n) {
                super(n);
            }

            @Override
            public String toString() {
                called.set(true);
                return super.toString();
            }

        }

        StringList list1 = new StringListMock(1);
        StringList list2 = new StringListMock(1);
        list1.add(new String("String 1"));
        list2.add(new String("String 1"));
        assertTrue("Same Circles should be equal", list1.equals(list2));
        assertFalse("The equals method should not be using toString for comparison", called.get());
    }

}
