    function changeCompanyTab(evt, companyName) {
        var i, tabcontent, tablinks;

        tabcontent = document.getElementsByClassName("tab-content");
        tablinks = document.getElementsByClassName("tab-links");

        for (i = 0; i < tabcontent.length; i++) {
            tabcontent[i].style.display = "none";
        }
        
        for (i = 0; i < tablinks.length; i++) {
            tablinks[i].className = tablinks[i].className.replace(" active", "");
        }

        document.getElementById(companyName).style.display = "block";
        evt.currentTarget.className += " active";
    }  
