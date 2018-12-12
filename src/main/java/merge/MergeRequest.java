package merge;


class MergeRequest {
    private String duplicates;
    private String idToPreserve;

    public String getDuplicates() {
        return duplicates;
    }

    public void setDuplicates(String duplicates) {
        this.duplicates = duplicates;
    }

    public String getIdToPreserve() {
        return idToPreserve;
    }

    public void setIdToPreserve(String idToPreserve) {
        this.idToPreserve = idToPreserve;
    }
}