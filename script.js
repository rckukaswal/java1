// Custom JavaScript for interactive features
document.addEventListener('DOMContentLoaded', function() {
    console.log('Website loaded successfully');
    
    // Form validation example
    const forms = document.querySelectorAll('form');
    forms.forEach(form => {
        form.addEventListener('submit', function(e) {
            const inputs = this.querySelectorAll('input[required]');
            let valid = true;
            
            inputs.forEach(input => {
                if (!input.value.trim()) {
                    valid = false;
                    input.style.borderColor = 'red';
                } else {
                    input.style.borderColor = '';
                }
            });
            
            if (!valid) {
                e.preventDefault();
                alert('कृपया सभी आवश्यक फ़ील्ड भरें');
            }
        });
    });
});
