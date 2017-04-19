package in.ua.denoming.juja.labs.lab26;

class Library {
    static String printCatalog(Issue[] catalog) {
        StringBuilder builder = new StringBuilder();
        if (catalog.length > 0) {
            for (Issue issue : catalog) {
                builder.append(issue.toString());
                builder.append(';');
            }
        }
        return builder.toString();
    }
}
