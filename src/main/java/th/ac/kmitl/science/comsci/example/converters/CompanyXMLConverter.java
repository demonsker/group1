package th.ac.kmitl.science.comsci.example.converters;

import th.ac.kmitl.science.comsci.example.models.Company;

public class CompanyXMLConverter  {

    public static String headTag;
    
    public  static String getXml(Company company,String headTag) {
         HeadTagCompanyXMLConverter headTags = HeadTagCompanyXMLConverter.valueOf(headTag);
         String xml = "<ram:"+headTags.getheadTag()+">"
                     +"\n\t<ram:ID>"+company.getId()+"</ram:ID>"
                     +"\n\t<ram:GlobalID>"+company.getGlobalId()+"</ram:GlobalID>"
                     +"\n\t<ram:Name>"+company.getName()+"</ram:Name>"
                     +"\n</ram:"+headTags.getheadTag()+">"
                     +"\n<ram:SpecifiedClLegalOrganization> "
                     +"\n\t<ram:ID>"+company.getTaxId()+"</ram:ID>"
                     +"\n</ram:SpecifiedClLegalOrganization>"; 
                     CompanyXMLConverter.headTag = headTags.getheadTag();
        return xml;
    }

}
