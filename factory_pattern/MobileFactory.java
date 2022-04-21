public class MobileFactory {
     Mobile createMobile(String origin) {
        switch (origin) {
            case "United States":
                return new IPhone();
            case "South Korea":
                return new Samsung();
            case "Japan":
                return new Sony();
        }
        return null;
    }

    Mobile createMobile(int id) {
        switch (id) {
            case 2201:
                return new IPhone();
            case 2202:
                return new Samsung();
            case 2203:
                return new Sony();
        }
        return null;
    }
}
