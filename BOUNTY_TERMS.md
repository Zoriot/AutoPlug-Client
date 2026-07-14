By submitting a Pull Request (PR) for an issue labeled with a bounty, you accept and agree to be bound by the following terms:

### 1. Eligibility & Award Criteria
* **Discretionary Acceptance:** The determination of whether a PR fully and satisfactorily resolves the issue, meets the project's quality standards, and is fit for merging lies within the sole technical discretion of the repository maintainers. 
* **Trigger Event:** The claim to the bounty arises only upon the formal approval and successful merging of the PR by a repository maintainer. No legal claim to a payout exists prior to this merge.
* **Test Requirements:** Your PR must include at least one automated test proving the fix or feature works as intended.
* **Refusal of Submissions:** Low-quality, incomplete, duplicate, or spam PRs may be closed without review or eligibility for the bounty.

### 2. Payment Terms
* **Payment Method:** Payments are made exclusively via PayPal.
* **Verification:** To receive the bounty, your PayPal email address must be visibly listed on your public GitHub profile before your PR is merged.
* **Fees & Taxes:** The bounty amount specified in the issue label (e.g., "50€") is the gross amount. Any transaction fees (including but not limited to PayPal service fees, cross-border fees, or currency conversion charges) as well as any applicable taxes (such as income tax or VAT) in the recipient's jurisdiction are the sole responsibility of the recipient and will be deducted from or borne by the recipient.

### 3. Intellectual Property, Licensing & Indemnification
* **Grant of Rights:** By submitting a PR, you represent and warrant that the code is your own original work and that you hold all necessary rights to distribute it. 
* **Licensing:** You agree that your contribution is licensed under the repository's official license (as specified in the project's `LICENSE` file). Additionally, you grant the repository owners a perpetual, irrevocable, worldwide, non-exclusive, sublicensable, and royalty-free right to use, modify, copy, and distribute your contribution.
* **Indemnification:** You agree to indemnify, defend, and hold harmless the repository owners and maintainers from and against any third-party claims, liabilities, losses, or expenses (including reasonable legal fees) arising from any intellectual property or copyright infringement contained in your contribution.

### 4. AI-Assisted Code Policy
* **Review Required:** While AI-assisted code is permitted, you must fully review, understand, and thoroughly test all AI-generated code before opening a PR. You remain fully responsible for the behavior and quality of the submitted code.
* **Disclosure:** PRs consisting predominantly of AI-generated code must clearly state this in the description.
* **Rejection Criteria:** Submissions containing hallucinated APIs, unnecessary rewrites, formatting-only changes, or duplicate logic will be rejected. Repeated low-quality AI submissions may result in a ban from the repository and future bounties.

### 5. Code Quality Requirements
* **Scope:** Keep PRs focused and limited to the single issue or feature described in the label.
* **Architecture:** Follow the existing project structure, naming conventions, and coding style. Reuse existing APIs, utility classes, and abstractions whenever possible. Avoid introducing new dependencies or frameworks without prior approval.
* **Documentation:** PRs must include a clear description outlining what changed, why it changed, and how it was tested.
* **Maintainability:** If a PR requires excessive maintainer cleanup, debugging, or rewriting, the maintainers reserve the right to close the PR without merging or paying out the bounty.

### 6. Inactivity, Derived PRs, and Takeovers
* **Inactivity & Forfeiture:** If a submitted PR requires changes, and the contributor fails to provide updates, respond to inquiries, or commit modifications for a consecutive period of thirty (30) days following a change request (`request changes`) or a clarifying comment by a maintainer, the PR is deemed abandoned. In this event, the maintainers reserve the right to merge, modify, or otherwise utilize the submitted code under the terms of the open-source license (Section 3) without any obligation to pay the bounty.
* **Derived PRs (Community Takeovers):** Because all submissions are licensed openly upon submission, any developer is permitted to use an existing, incomplete, or inactive PR as a basis to build their own PR. 
* **Fairness Grace Period:** If a derived PR is submitted that successfully resolves the issue and is ready to be merged, a fairness grace period is triggered for the original contributor:
  * The maintainers will notify the original contributor via a comment on their original PR.
  * The original contributor has exactly seven (7) calendar days from the timestamp of this notification to update their original PR to a fully mergeable and approved state.
  * If the original contributor successfully completes and obtains approval for their PR within this 7-day period, their original PR will be merged and they will receive the bounty.
  * If the original contributor fails to meet this deadline or cannot achieve a mergeable state, the derived PR may be merged instead, and the bounty will be awarded solely to the author of the derived PR. The original contributor waives all claims to the bounty in this scenario.

### 7. Amendments & Dispute Resolution
* **Amendments:** We reserve the right to amend these terms at any time. Any modifications will apply prospectively to PRs submitted *after* the updated terms have been published in this repository.
* **Governing Law:** These terms, the bounty program, and any disputes arising out of or in connection with them shall be governed by and construed in accordance with the laws of Germany, excluding its conflict of laws provisions.
