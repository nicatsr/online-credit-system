document.querySelector('#getAllCreditResults').addEventListener('click' , getAllCreditResults);
document.querySelector('#getDebtorResultByFinCode').addEventListener('click' , getDebtorResultByFinCode);
document.querySelector('#getCreditResultByFinCode').addEventListener('click' , getCreditResultByFinCode);

function getAllCreditResults(){
    document.getElementById('credit').style.display = "table";
    var url = "http://localhost:8080/result/list";
    var xhr = new XMLHttpRequest();

    xhr.open('GET' , url , true);

    xhr.onload = function(){
        if(this.status === 200){
            var creditList = JSON.parse(this.responseText);

            var html = "";


            creditList.forEach(credit =>{
                html += `<tr>
                    <td>${credit.baseAmount}</td>
                    <td>${credit.interestRate}</td>
                    <td>${credit.generalPayment}</td>
                    <td>${credit.monthlyPayment}</td>
                    <td>${credit.periodWithMonth}</td>
                    <td>${credit.startDate}</td>
                    <td>${credit.endDate}</td>
                    <td>${credit.finCode}</td>
                    <td>${credit.status}</td>
                    <tr>`
            })

            document.querySelector('#creditResultsTable')
                .innerHTML = html;
        }

    }
    xhr.send();
}

function getDebtorResultByFinCode(){
    document.getElementById('customer').style.display = "table";
        var finCode = document.getElementById('debtorFinCode').value;
        var url = "http://localhost:8080/result/debtorResult/" + finCode;

        var xhr = new XMLHttpRequest();

        xhr.open('GET' ,url ,true);

        xhr.onload = () =>{
            if(xhr.status === 200){
                var debtorResult = JSON.parse(xhr.responseText);
                var html =` <tr>
                <td>${debtorResult.relatedPerson}</td>
                <td>${debtorResult.debtorPhoneNumber}</td>
                <td>${debtorResult.salary}</td>
                <td>${debtorResult.debtorFinCode}</td>
                <td>${debtorResult.guarantorFullName}</td>
                <td>${debtorResult.guarantorFinCode}</td>
                <td>${debtorResult.guarantorPhoneNumber}</td>
                 </tr>`;

                document.querySelector('#debtorResultTable')
                    .innerHTML = html;

            }
        }
        xhr.send();
}

function getCreditResultByFinCode(){
    document.getElementById('creditResult').style.display = "table";
    var finCode = document.getElementById('creditResultFinCode').value;
    var url = "http://localhost:8080/result/creditResult/" + finCode;

    var xhr = new XMLHttpRequest();

    xhr.open('GET' ,url ,true);

    xhr.onload = () =>{
        if(xhr.status === 200){
            var credit = JSON.parse(xhr.responseText);
            var html = `<tr>
                    <td>${credit.baseAmount}</td>
                    <td>${credit.interestRate}</td>
                    <td>${credit.generalPayment}</td>
                    <td>${credit.monthlyPayment}</td>
                    <td>${credit.periodWithMonth}</td>
                    <td>${credit.startDate}</td>
                    <td>${credit.endDate}</td>
                    <td>${credit.finCode}</td>
                    <td>${credit.status}</td>
                    <tr>`;

            document.querySelector('#creditResultTable')
                .innerHTML = html;

        }
    }
    xhr.send();
}