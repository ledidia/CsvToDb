public abstract class ValidDate implements ReadData {
    boolean isValid(String[] values) {
        return values.length == NUMBER_OF_COLUMN;
    }
}
