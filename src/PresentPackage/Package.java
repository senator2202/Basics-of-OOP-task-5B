package PresentPackage;

import PresentPackage.SweetsPackage.Sweets;

public class Package {
    private PackageType packageType;

    public PackageType getPackageType() {
        return packageType;
    }

    public void setPackageType(PackageType packageType) {
        this.packageType = packageType;
    }

    public enum PackageType {
        Bag,
        Box
    }

    public Package(PackageType packageType) {
        this.packageType=packageType;
    }

    public Present putCandy(Sweets sweets) {
        Present present=new Present.Builder()
                .withSweets(sweets)
                .withPackage(this)
                .build();
        return present;
    }

    @Override
    public String toString() {
        return "package type: "+packageType;
    }
}
