const sideMenu = document.querySelector('aside');
const menuBtn = document.getElementById('menu-btn');
const closeBtn = document.getElementById('close-btn');

const darkMode = document.querySelector('.dark-mode');

menuBtn.addEventListener('click', () => {
    sideMenu.style.display = 'block';
});

closeBtn.addEventListener('click', () => {
    sideMenu.style.display = 'none';
});

darkMode.addEventListener('click', () => {
    document.body.classList.toggle('dark-mode-variables');
    darkMode.querySelector('span:nth-child(1)').classList.toggle('active');
    darkMode.querySelector('span:nth-child(2)').classList.toggle('active');
})


Orders.forEach(order => {
    const tr = document.createElement('tr');
    const trContent = `
        <td>${order.productName}</td>
        <td>${order.productNumber}</td>
        <td>${order.paymentStatus}</td>
        <td class="${order.status === 'Declined' ? 'danger' : order.status === 'Pending' ? 'warning' : 'primary'}">${order.status}</td>
        <td class="primary">Details</td>
    `;
    tr.innerHTML = trContent;
    document.querySelector('table tbody').appendChild(tr);
});


$('.sub-btn').click(function (){
    $('this').next('.side-menu').slideToggle();
    $(this).find('.dropdown').toggleClass('rotate');
});

$('#dashboard').css('display','block');
$('#employee').css('display','none');
$('.employee-view').css('display','none');
$('#item').css('display','none');
$('#item-list').css('display','none');
$('#customer').css('display','none');
$('.Customer-view').css('display','none');
$('#supplier').css('display','none');
$('.supplier-view').css('display','none');

$('.active').on('click', function () {
    $('#dashboard').show();
    $('#employee').hide();
    $('.employee-view').hide();
    $('#item').hide();
    $('#item-list').hide();
    $('#customer').hide();
    $('.Customer-view').hide();
    $('.supplier-view').hide();
    $('#supplier').hide();
});

$('#employee-btn').on('click', function () {
    $('#dashboard').hide();
    $('#employee').hide();
    $('.employee-view').show();
    $('#item').hide();
    $('#item-list').hide();
    $('.Customer-view').hide();
    $('.supplier-view').hide();
    $('#supplier').hide();
});

$('.add-new-employee').on('click', function () {
    $('#employee').show();
    $('.employee-view').hide();
    $('#item').hide();
    $('#item-list').hide();
    $('#customer').hide();
    $('.supplier-view').hide();
    $('#supplier').hide();
});

$('#item-btn').on('click', function () {
    $('#dashboard').hide();
    $('#employee').hide();
    $('.employee-view').hide();
    $('#item').hide();
    $('#item-list').show();
    $('#customer').hide();
    $('.supplier-view').hide();
    $('#supplier').hide();
});

$('.Show-Item').on('click', function () {
    $('#dashboard').hide();
    $('#employee').hide();
    $('.employee-view').hide();
    $('#item').hide();
    $('#item-list').show();
    $('#customer').hide();
    $('.supplier-view').hide();
    $('#supplier').hide();
});

$('#customer-btn').on('click', function () {
    $('#dashboard').hide();
    $('#employee').hide();
    $('.employee-view').hide();
    $('#item').hide();
    $('#item-list').hide();
    $('.Customer-view').show();
    $('#customer').hide();
    $('.supplier-view').hide();
    $('#supplier').hide();
});

$('.add-new-customer').on('click', function () {
    $('#dashboard').hide();
    $('#employee').hide();
    $('.employee-view').hide();
    $('#item').hide();
    $('#item-list').hide();
    $('.Customer-view').hide();
    $('#customer').show();
    $('.supplier-view').hide();
    $('#supplier').hide();
});

$('#supplier-btn').on('click', function () {
    $('#dashboard').hide();
    $('#employee').hide();
    $('.employee-view').hide();
    $('#item').hide();
    $('#item-list').hide();
    $('.Customer-view').hide();
    $('#customer').hide();
    $('.supplier-view').show();
    $('#supplier').hide();
});

$('.add-new-supplier').on('click', function () {
    $('#dashboard').hide();
    $('#employee').hide();
    $('.employee-view').hide();
    $('#item').hide();
    $('#item-list').hide();
    $('.Customer-view').hide();
    $('#customer').hide();
    $('.supplier-view').hide();
    $('#supplier').show();
});

// -----add photo--------


function previewPhoto(event) {
    var input = event.target;
    var reader = new FileReader();
    reader.onload = function(){
        var photoPreview = document.getElementById('photoPreview');
        photoPreview.style.display = 'block';
        photoPreview.src = reader.result;
    };
    reader.readAsDataURL(input.files[0]);
}

function previewItemPhoto(event) {
    var input = event.target;
    var reader = new FileReader();
    reader.onload = function(){
        var photoPreview = document.getElementById('ItemPhotoPreview');
        photoPreview.style.display = 'block';
        photoPreview.src = reader.result;
    };
    reader.readAsDataURL(input.files[0]);
}

Employees.forEach(employee => {
    const tr = document.createElement('tr');
    const trContents = `
        <td>${employee.EmployeeCode}</td>
        <td>${employee.EmployeeName}</td>
        <td>${employee.Gender}</td>
        <td>${employee.Level}</td>
        <td>${employee.TotalPoints}</td>
        <td>${employee.JoinDate}</td>
        <td>${employee.DateOfBirth}</td>
        <td>${employee.ContactNumber}</td>
        <td>${employee.Address}</td>
        <td>${employee.Email}</td>
        <td class="${employee.status === 'Declined' ? 'danger' : employee.status === 'Pending' ? 'warning' : 'primary'}">${employee.status}</td>
        <td class="primary">Details</td>
    `;
    tr.innerHTML = trContents;
    document.querySelector('table tbody').appendChild(tr);
});

