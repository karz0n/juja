package in.ua.denoming.juja.labs.lab27;

import in.ua.denoming.juja.shared.Issue;

class Library {
    static String getIssueWithCountPagesMoreN(Issue[] catalog, int barrierCountPages) {
        StringBuilder builder = new StringBuilder();
        if (catalog.length > 0) {
            for (Issue issue : catalog) {
                if (issue.getCountPages() > barrierCountPages) {
                    builder.append(issue.toString());
                }
            }
        }
        return builder.toString();
    }
}
