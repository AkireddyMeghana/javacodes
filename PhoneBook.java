public class PhoneBook
{
    public PhoneBook(double phn, String contactnames) {
        this.phn = phn;
        Contactnames = contactnames;
    }

    double phn;

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phn=" + phn +
                ", Contactnames='" + Contactnames + '\'' +
                '}';
    }

    public double getPhn() {
        return phn;
    }

    public void setPhn(double phn) {
        this.phn = phn;
    }

    public String getContactnames() {
        return Contactnames;
    }

    public void setContactnames(String contactnames) {
        Contactnames = contactnames;
    }

    String Contactnames;
}