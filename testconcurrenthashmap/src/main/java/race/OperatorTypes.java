package race;

public enum OperatorTypes {

    BETWEEN {
        @Override
        public Operations createOperation() {
            return new BetweenOperation();
        }
    },
    IN {
        @Override
        public Operations createOperation() {
            return new InOperation();
        }
    };

    public abstract Operations createOperation();

}

